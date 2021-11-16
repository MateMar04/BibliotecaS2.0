import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;

public class vClientes extends JFrame {
    private JComboBox<String> comboBoxCliente;
    private JLabel lbNombre;
    private JLabel lbEmail;
    private JLabel lbTelefono;
    private JLabel lbDireccion;
    private JButton cerrarButton;
    private JPanel panel1;
    private JLabel lbListaPrestamos;

    public vClientes(Biblioteca biblioteca) {
        add(panel1);
        setSize(800, 500);

        Vector<String> comboBoxItems = new Vector<String>();
        ArrayList<Cliente> clientes = biblioteca.listarClientes();
        for (Cliente cliente : clientes) {
            comboBoxItems.add(cliente.getNombre());
        }
        comboBoxCliente.setModel(new DefaultComboBoxModel<>(comboBoxItems));
        comboBoxCliente.setSelectedIndex(-1);

        comboBoxCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = clientes.get(comboBoxCliente.getSelectedIndex());
                clienteDataLoad(cliente);
                ArrayList prestamos = prestamosDataLoad(cliente, biblioteca);
                lbListaPrestamos.setText(prestamos.toString());
            }
        });

        cerrarButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
            }
        });
    }

    private ArrayList prestamosDataLoad(Cliente cliente, Biblioteca biblioteca) {
        ArrayList prestamos = new ArrayList();

        for (Prestamo prestamo : biblioteca.listarPrestamos()) {
            ArrayList<Publicacion> publicaciones = prestamo.getListaPublicaionesPrestadas();
            if (prestamo.getCliente().equals(cliente)) {
                for (Publicacion publicacion : publicaciones) {
                    prestamos.add(publicacion.getTitulo());
                }
            }
        }
        return prestamos;
    }

    private void clienteDataLoad(Cliente cliente) {
        lbNombre.setText(cliente.getNombre());
        lbDireccion.setText(cliente.getDireccion().toString());
        lbTelefono.setText(cliente.getTelefono());
        lbEmail.setText(cliente.getEmail());
    }
}
