import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;

public class vLibros extends JFrame {
    private JPanel panel1;
    private JComboBox comboBoxLibros;
    private JLabel lbTitulo;
    private JLabel lbAutor;
    private JLabel lbCategoria;
    private JLabel lbEditorial;
    private JButton cerrarButton;

    public vLibros(Biblioteca biblioteca) {
        add(panel1);
        setSize(500, 500);


        Vector comboBoxItems = new Vector();
        ArrayList<Libro> libros = biblioteca.listarLibros();
        for (Libro libro : libros) {
            comboBoxItems.add(libro.getTitulo());
        }
        comboBoxLibros.setModel(new DefaultComboBoxModel(comboBoxItems));
        comboBoxLibros.setSelectedIndex(-1);

        comboBoxLibros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataLoad(libros);
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

    private void dataLoad(ArrayList<Libro> libros) {
        Libro libro = libros.get(comboBoxLibros.getSelectedIndex());
        lbTitulo.setText(libro.getTitulo());
        lbAutor.setText(libro.getAutor().getNombre());
        lbCategoria.setText(libro.getCategoria().getNombre());
        lbEditorial.setText(libro.getEditorial().getNombre());
    }
}
