import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class vBiblioteca extends JFrame {
    private JPanel panel1;
    private JButton clientesButton;
    private JLabel cantClientes;
    private JLabel cantLibros;
    private JLabel cantPublicaciones;
    private JLabel cantRevistas;
    private JButton librosButton;
    private JButton revistasButton;

    public vBiblioteca(Biblioteca biblioteca) {
        add(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800, 500);

        dataLoad(biblioteca);

        clientesButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                vClientes vClientes = new vClientes(biblioteca);
                vClientes.setVisible(true);
            }
        });

        librosButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                vLibros vLibros = new vLibros(biblioteca);
                vLibros.setVisible(true);
            }
        });

        revistasButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                vRevistas vRevistas = new vRevistas(biblioteca);
                vRevistas.setVisible(true);
            }
        });
    }

    private void dataLoad(Biblioteca biblioteca) {
        cantClientes.setText(String.valueOf(biblioteca.cantidadClientes()));
        cantLibros.setText(String.valueOf(biblioteca.cantidadLibros()));
        cantPublicaciones.setText(String.valueOf(biblioteca.cantidadPublicaciones()));
        cantRevistas.setText(String.valueOf(biblioteca.cantidadRevistas()));
    }
}
