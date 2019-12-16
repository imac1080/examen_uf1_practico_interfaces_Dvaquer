package examen_UF1_practico_AMS2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import javax.swing.Action;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

public class principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JList<String> list;
	private JPanel panel;
	private JPanel panel_1;
	private JScrollPane menuScrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 513);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		panel = new JPanel();
		panel.setBounds(5, 5, 200, 465);
		panel.setBackground(Color.GRAY);
		panel.setPreferredSize(new Dimension(200, 200));
		panel_1 = new JPanel();
		panel_1.setBounds(761, 5, -554, 465);
		DefaultListModel<String> model = new DefaultListModel<>();
		panel_1.setLayout(null);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		list = new JList(model);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);
		menuScrollPane = new JScrollPane(list);
		menuScrollPane.setMinimumSize(new Dimension(100, 50));
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                menuScrollPane,
                panel);
		list.setVisibleRowCount(4);

		ArrayList<Alumno> arrayAlumno = new ArrayList<Alumno>();
		Alumno alu3 = new Alumno("ap1_1", "ap2_1", "Nombre1", "456325234", "ASIX");
		Alumno alu4 = new Alumno("ap1_2", "ap2_2", "Nombre2", "356746534", "ASIX");
		Alumno alu1 = new Alumno("ap1_3", "ap2_3", "Nombre3", "789653342", "ASIX");
		Alumno alu2 = new Alumno("ap1_4", "ap2_4", "Nombre4", "337638377", "ASIX");
		Alumno alu2a = new Alumno("ap1_4a", "ap2_4a", "Nombre4a", "337638377a", "ASIX");
		Alumno alu2b = new Alumno("ap1_4b", "ap2_4b", "Nombre4b", "337638377b", "ASIX");
		Alumno alu2c = new Alumno("ap1_4c", "ap2_4c", "Nombre4c", "337638377c", "ASIX");
		Alumno alu2d = new Alumno("ap1_4d", "ap2_4d", "Nombre4d", "337638377d", "ASIX");

		Alumno alu5 = new Alumno("ap1_5", "ap2_5", "Nombre5", "345627277", "DAM");
		Alumno alu6 = new Alumno("ap1_6", "ap2_6", "Nombre6", "245723672", "DAM");
		Alumno alu7 = new Alumno("ap1_7", "ap2_7", "Nombre7", "845632235", "DAM");
		Alumno alu8 = new Alumno("ap1_8", "ap2_8", "Nombre8", "345648335", "DAM");

		Alumno alu9 = new Alumno("ap1_9", "ap2_9", "Nombre9", "345277376", "DAW");
		Alumno alu10 = new Alumno("ap1_10", "ap2_10", "Nombre10", "2452626226", "DAW");
		Alumno alu11 = new Alumno("ap1_11", "ap2_11", "Nombre11", "262623446", "DAW");
		Alumno alu12 = new Alumno("ap1_12", "ap2_12", "Nombre12", "456346346", "DAW");
		arrayAlumno.add(alu3);
		arrayAlumno.add(alu4);
		arrayAlumno.add(alu1);
		arrayAlumno.add(alu2);
		arrayAlumno.add(alu2a);
		arrayAlumno.add(alu2b);
		arrayAlumno.add(alu2c);
		arrayAlumno.add(alu2d);
		arrayAlumno.add(alu5);
		arrayAlumno.add(alu6);
		arrayAlumno.add(alu7);
		arrayAlumno.add(alu8);
		arrayAlumno.add(alu9);
		arrayAlumno.add(alu10);
		arrayAlumno.add(alu11);
		arrayAlumno.add(alu12);
		ArrayList<String> cursos = new ArrayList<String>();
		for (int i = 0; i < arrayAlumno.size(); i++) {
			boolean Exsite = false;
			for (int j = 0; j < cursos.size(); j++) {
				if (arrayAlumno.get(i).getCurso().equals(cursos.get(j))) {
					Exsite = true;
					break;
				}
			}

			if (!Exsite) {
				cursos.add(arrayAlumno.get(i).getCurso());
			}
		}
		System.out.println(cursos.size());
		System.out.println("alumnos" + arrayAlumno.size());

		ArrayList<JButton> arrayBotones = new ArrayList<JButton>();

		for (int i = 0; i < cursos.size(); i++) {
			arrayBotones.add(new JButton("" + cursos.get(i)));
		}
		for (JButton jButton : arrayBotones) {
			jButton.setPreferredSize(new Dimension(100, 100));
			panel.add(jButton);
			jButton.setPreferredSize(new Dimension(100, 100));
			for (int i = 0; i < cursos.size(); i++) {
				String curso2 = cursos.get(i);
				if (jButton.getText().equals(cursos.get(i))) {
					jButton.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							System.out.println("dam");
							model.clear();
							for (int i = 0; i < arrayAlumno.size(); i++) {
								if (arrayAlumno.get(i).getCurso().equals(curso2)) {
									model.addElement(arrayAlumno.get(i).getNombre());
								}
							}
						}
					});
				}
			}
		}

		panel.add(list);
		list.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				Alumno al = null;
				for (int i = 0; i < arrayAlumno.size(); i++) {
					if (arrayAlumno.get(i).getNombre().equals(list.getSelectedValue())) {
						al = arrayAlumno.get(i);
						break;
					}
				}
				textField.setText(al.getNombre());

				textField_1.setText(al.getApellido1());
				textField_2.setText(al.getApellido2());
				textField_3.setText(al.getTelefono());
			}
		});
		contentPane.setLayout(null);

		contentPane.add(panel);
		contentPane.add(panel_1);

		textField = new JTextField();
		textField.setBounds(414, 83, 136, 18);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(261, 81, 107, 19);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblNewLabel_1 = new JLabel("Primer apellido:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(261, 121, 122, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblSegundoApellido = new JLabel("Segundo apellido:");
		lblSegundoApellido.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSegundoApellido.setBounds(261, 164, 153, 14);
		contentPane.add(lblSegundoApellido);

		textField_2 = new JTextField();
		textField_2.setBounds(414, 164, 136, 18);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTelefono.setBounds(261, 199, 122, 14);
		contentPane.add(lblTelefono);

		textField_3 = new JTextField();
		textField_3.setBounds(414, 199, 136, 18);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(414, 121, 136, 18);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
