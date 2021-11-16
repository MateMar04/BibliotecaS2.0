import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;

public class vRevistas extends JFrame {
    private JComboBox comboBoxRevista;
    private JLabel lbTitulo;
    private JLabel lbAutor;
    private JLabel lbCategoria;
    private JLabel lbEditorial;
    private JButton cerrarButton;
    private JPanel panel1;

    public vRevistas(Biblioteca biblioteca) {
        add(panel1);
        setSize(800, 500);

        Vector comboBoxItems = new Vector();
        ArrayList<Revista> revistas = biblioteca.listarRevistas();
        for (Revista revista : revistas) {
            comboBoxItems.add(revista.getTitulo());
        }
        comboBoxRevista.setModel(new DefaultComboBoxModel(comboBoxItems));
        comboBoxRevista.setSelectedIndex(-1);

        comboBoxRevista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataLoad(revistas);
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

    private void dataLoad(ArrayList<Revista> revistas) {
        Revista revista = revistas.get(comboBoxRevista.getSelectedIndex());
        lbTitulo.setText(revista.getTitulo());
        lbAutor.setText(revista.getAutor().getNombre());
        lbCategoria.setText(revista.getCategoria().getNombre());
        lbEditorial.setText(revista.getEditorial().getNombre());
    }
}
