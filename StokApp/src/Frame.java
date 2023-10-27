import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Panel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JTable;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField urunkodutext;
	private JTextField urunTanimText;
	private JTextField aciklamaText;
	private JTextField urunTipiText;
	private JTextField malzemeTuruText;
	private JTextField tedarikTipiText;
	private JTextField olcuBirimiText;
	private JTextField depoText;
	private JTable table;
	private JTextField aramaText;

	DefaultTableModel model = new DefaultTableModel();
	Object[] kolonlar ={ "ID", "ÜRÜN KODU", "ÜRÜN TANIMI", "ÜRÜN TİPİ", "AÇIKLAMA", "MALZEME TÜRÜ", "TEDARİK TİPİ",
			"ÖLÇÜ BİRİMİ", "DEPO" };
	Object[] satirlar=new Object[9];

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Frame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\doguk\\Desktop\\GAME\\stok img.jpg"));
		setTitle("STOK TAKİP PROGRAMI\r\n\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1399, 811);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 392, 844, 369);
		contentPane.add(scrollPane);

		JPanel panel_2 = new JPanel();
		scrollPane.setViewportView(panel_2);
		panel_2.setLayout(null);
		panel_2.setForeground(Color.BLACK);
		panel_2.setBorder(null);

		JLabel lblNewLabel_5 = new JLabel("Ürün Kodu");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(39, 61, 81, 20);
		panel_2.add(lblNewLabel_5);

		urunkodutext = new JTextField();
		urunkodutext.setColumns(10);
		urunkodutext.setBounds(130, 62, 659, 23);
		panel_2.add(urunkodutext);

		JLabel lblNewLabel_2_1 = new JLabel("Ürün Tanımı");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(29, 97, 86, 23);
		panel_2.add(lblNewLabel_2_1);

		urunTanimText = new JTextField();
		urunTanimText.setColumns(10);
		urunTanimText.setBounds(130, 96, 659, 29);
		panel_2.add(urunTanimText);

		aciklamaText = new JTextField();
		aciklamaText.setColumns(10);
		aciklamaText.setBounds(130, 170, 659, 50);
		panel_2.add(aciklamaText);

		JLabel lblNewLabel_3_2 = new JLabel("Açıklama");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(44, 182, 76, 23);
		panel_2.add(lblNewLabel_3_2);

		Label label_3 = new Label("Ürün Tipi\r\n\r\n");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(44, 138, 79, 22);
		panel_2.add(label_3);

		Label label_1_1 = new Label("Malzeme Türü");
		label_1_1.setFont(new Font("Dialog", Font.BOLD, 14));
		label_1_1.setBounds(12, 239, 108, 20);
		panel_2.add(label_1_1);

		JLabel lblNewLabel_3_1_3 = new JLabel("Tedarik Tipi\r\n");
		lblNewLabel_3_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_3.setBounds(34, 265, 86, 23);
		panel_2.add(lblNewLabel_3_1_3);

		JLabel lblNewLabel_3_1_1_1 = new JLabel("Ölçü Birimi\r\n");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_1.setBounds(44, 295, 76, 23);
		panel_2.add(lblNewLabel_3_1_1_1);

		JLabel lblNewLabel_3_1_2_1 = new JLabel("Depo\r\n");
		lblNewLabel_3_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_2_1.setBounds(77, 329, 43, 23);
		panel_2.add(lblNewLabel_3_1_2_1);

		urunTipiText = new JTextField();
		urunTipiText.setColumns(10);
		urunTipiText.setBounds(131, 136, 658, 23);
		panel_2.add(urunTipiText);

		malzemeTuruText = new JTextField();
		malzemeTuruText.setColumns(10);
		malzemeTuruText.setBounds(130, 236, 659, 23);
		panel_2.add(malzemeTuruText);

		tedarikTipiText = new JTextField();
		tedarikTipiText.setColumns(10);
		tedarikTipiText.setBounds(130, 267, 659, 23);
		panel_2.add(tedarikTipiText);

		olcuBirimiText = new JTextField();
		olcuBirimiText.setColumns(10);
		olcuBirimiText.setBounds(130, 297, 659, 23);
		panel_2.add(olcuBirimiText);

		depoText = new JTextField();
		depoText.setColumns(10);
		depoText.setBounds(130, 331, 659, 23);
		panel_2.add(depoText);

		JScrollPane scrollPane_1_1_2_1 = new JScrollPane();
		scrollPane_1_1_2_1.setBounds(362, 11, 196, 29);
		panel_2.add(scrollPane_1_1_2_1);

		Panel panel_3_1_1_1 = new Panel();
		scrollPane_1_1_2_1.setViewportView(panel_3_1_1_1);
		panel_3_1_1_1.setLayout(null);

		JLabel stokBilgileriText = new JLabel("STOK BİLGİLERİ\r\n");
		stokBilgileriText.setForeground(new Color(199, 21, 133));
		stokBilgileriText.setFont(new Font("Tahoma", Font.BOLD, 16));
		stokBilgileriText.setBounds(31, 0, 133, 23);
		panel_3_1_1_1.add(stokBilgileriText);

		JScrollPane scrollPane_1_1_2 = new JScrollPane();
		scrollPane_1_1_2.setBounds(1028, 392, 196, 76);
		contentPane.add(scrollPane_1_1_2);

		Panel panel_3_1_1 = new Panel();
		scrollPane_1_1_2.setViewportView(panel_3_1_1);
		panel_3_1_1.setLayout(null);

		JLabel islemlerText = new JLabel("İŞLEMLER");
		islemlerText.setForeground(new Color(199, 21, 133));
		islemlerText.setFont(new Font("Tahoma", Font.BOLD, 16));
		islemlerText.setBounds(56, 23, 81, 23);
		panel_3_1_1.add(islemlerText);

		JScrollPane scrollPane_1_1_1 = new JScrollPane();
		scrollPane_1_1_1.setBounds(1142, 507, 196, 110);
		contentPane.add(scrollPane_1_1_1);

		Panel panel_3_2 = new Panel();
		scrollPane_1_1_1.setViewportView(panel_3_2);
		panel_3_2.setLayout(null);

		JLabel veriGuncelleText = new JLabel("VERİ GÜNCELLE\r\n\r\n");
		veriGuncelleText.setFont(new Font("Tahoma", Font.BOLD, 17));
		veriGuncelleText.setBackground(Color.CYAN);
		veriGuncelleText.setBounds(34, 11, 142, 20);
		panel_3_2.add(veriGuncelleText);

		JButton guncelleButonu = new JButton("GÜNCELLE\r\n");
		guncelleButonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBGuncelle.guncelle();
			}
		});
		guncelleButonu.setFont(new Font("Tahoma", Font.BOLD, 13));
		guncelleButonu.setBackground(SystemColor.textHighlight);
		guncelleButonu.setBounds(44, 42, 105, 31);
		panel_3_2.add(guncelleButonu);

		JScrollPane scrollPane_1_1_1_1 = new JScrollPane();
		scrollPane_1_1_1_1.setBounds(1142, 624, 196, 110);
		contentPane.add(scrollPane_1_1_1_1);

		Panel panel = new Panel();
		scrollPane_1_1_1_1.setViewportView(panel);
		panel.setLayout(null);

		JLabel veriSilText = new JLabel("VERİ SİL  \r\n");
		veriSilText.setBounds(51, 11, 85, 21);
		panel.add(veriSilText);
		veriSilText.setFont(new Font("Tahoma", Font.BOLD, 17));

		JButton silButonu = new JButton("SİL\r\n\r\n");
		silButonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBSilme.sil();
			}
		});
		silButonu.setBounds(61, 43, 68, 27);
		panel.add(silButonu);
		silButonu.setFont(new Font("Tahoma", Font.BOLD, 15));
		silButonu.setBackground(Color.RED);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(24, 55, 1334, 324);
		contentPane.add(scrollPane_1);

		table = new JTable();
		DBBaglan.baglan();
		model.setColumnIdentifiers(kolonlar);
		model.addRow(satirlar);
		table.setModel(model);
		scrollPane_1.setViewportView(table);

		JScrollPane scrollPane_1_1_2_2 = new JScrollPane();
		scrollPane_1_1_2_2.setBounds(566, 11, 222, 33);
		contentPane.add(scrollPane_1_1_2_2);

		Panel panel_3_1_1_2 = new Panel();
		scrollPane_1_1_2_2.setViewportView(panel_3_1_1_2);
		panel_3_1_1_2.setLayout(null);

		JLabel stokTablosuText = new JLabel(" STOK TABLOSU");
		stokTablosuText.setBounds(46, 0, 143, 23);
		panel_3_1_1_2.add(stokTablosuText);
		stokTablosuText.setForeground(new Color(0, 0, 255));
		stokTablosuText.setFont(new Font("Tahoma", Font.BOLD, 16));

		aramaText = new JTextField();
		aramaText.setText("Tüm Kolonda Ara");
		aramaText.setColumns(10);
		aramaText.setBounds(52, 24, 353, 23);
		contentPane.add(aramaText);

		JScrollPane scrollPane_1_1_3 = new JScrollPane();
		scrollPane_1_1_3.setBounds(924, 624, 196, 110);
		contentPane.add(scrollPane_1_1_3);

		Panel panel_3_1 = new Panel();
		scrollPane_1_1_3.setViewportView(panel_3_1);
		panel_3_1.setLayout(null);

		JLabel veriEkleText = new JLabel("VERİ EKLE\r\n\r\n");
		veriEkleText.setFont(new Font("Tahoma", Font.BOLD, 17));
		veriEkleText.setBounds(53, 11, 88, 20);
		panel_3_1.add(veriEkleText);

		JButton ekleButonu = new JButton("Ekle");
		ekleButonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DBVeriEkle.ekle();
			}
		});
		ekleButonu.setBounds(63, 42, 77, 31);
		panel_3_1.add(ekleButonu);
		ekleButonu.setFont(new Font("Tahoma", Font.BOLD, 13));
		ekleButonu.setBackground(Color.ORANGE);

		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBounds(924, 507, 196, 106);
		contentPane.add(scrollPane_1_1);

		Panel panel_3 = new Panel();
		scrollPane_1_1.setViewportView(panel_3);
		panel_3.setLayout(null);

		JLabel veriListeleText = new JLabel("VERİ LİSTELE");
		veriListeleText.setFont(new Font("Tahoma", Font.BOLD, 17));
		veriListeleText.setBackground(Color.CYAN);
		veriListeleText.setBounds(38, 11, 124, 20);
		panel_3.add(veriListeleText);

		JButton listeleButonu = new JButton("LİSTELE");
		listeleButonu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet rst = DBBaglan.baglan();
				model.addRow(satirlar);
				try {
					while (rst.next()) {
						satirlar[0] = rst.getString("id");
						satirlar[1] = rst.getString("urun_kodu");
						satirlar[2] = rst.getString("urun_tanimi");
						satirlar[3] = rst.getString("urun_tipi");
						satirlar[4] = rst.getString("aciklama");
						satirlar[5] = rst.getString("malzeme_turu");
						satirlar[6] = rst.getString("tedarik_tipi");
						satirlar[7] = rst.getString("olcu_birimi");
						satirlar[8] = rst.getString("depo");
						model.addRow(satirlar);
						
					}
					table.setModel(model);
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
					e1.printStackTrace();
				}

				
			}
		});
		listeleButonu.setBounds(48, 42, 95, 33);
		panel_3.add(listeleButonu);
		listeleButonu.setFont(new Font("Tahoma", Font.BOLD, 13));
		listeleButonu.setBackground(Color.GREEN);
	}
}
