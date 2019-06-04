package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import data.Person;

import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;

public class MyFirstGuiWindow2 {

	protected Shell shlFrwindow;
	private Text vornameTF;
	private Text NachnameTF;
	private Text StrasseTF;
	private Text HausnummerTF;
	private Text PLZTF;
	private Text OrtTF;
	private Label VornameTFout;
	private Label NachnameTFout;
	private Label StrasseTFout;
	private Label HausnummerTFout;
	private Label PLZTFout;
	private Label OrtTFout;

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyFirstGuiWindow2 window = new MyFirstGuiWindow2();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlFrwindow.open();
		shlFrwindow.layout();
		while (!shlFrwindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFrwindow = new Shell();
		shlFrwindow.setCursor(SWTResourceManager.getCursor(SWT.CURSOR_ARROW));
		shlFrwindow.setBackground(SWTResourceManager.getColor(0, 0, 139));
		shlFrwindow.setForeground(SWTResourceManager.getColor(0, 100, 0));
		shlFrwindow.setSize(599, 323);
		shlFrwindow.setText("FrWindow");

		Button btnMybutton = new Button(shlFrwindow, SWT.NONE);
		btnMybutton.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btnMybutton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Knoppe gedrückt");
				// System.out.println(vornameTF.getText());
				// System.out.println(NachnameTF.getText());
				// System.out.println(StrasseTF.getText());
				// System.out.println(HausnummerTF.getText());
				// System.out.println(PLZTF.getText());
				// System.out.println(OrtTF.getText());

				System.out.println(getVornameTF().getText());
				System.out.println(getNachnameTF().getText());
				System.out.println(getStrasseTF().getText());
				System.out.println(getHausnummerTF().getText());
				System.out.println(getPLZTF().getText());
				System.out.println(getOrtTF().getText());

				//

				Person p1;
				p1 = new Person();

				p1.setVorname(getVornameTF().getText());
				p1.setNachname(getNachnameTF().getText());
				p1.setHausnummer(getHausnummerTF().getText());
				p1.setOrt(getOrtTF().getText());
				p1.setPlz(getPLZTF().getText());
				p1.setStrasse(getStrasseTF().getText());

				System.out.println(p1);
				//
				Person.getListe().add(p1);
				//
				System.out.println(Person.getListe());
				//
				getVornameTFout().setText(getVornameTF().getText());
				//
				getVornameTF().setText("");
				getHausnummerTF().setText("");
				getNachnameTF().setText("");
				getOrtTF().setText("");
				getStrasseTF().setText("");
				getPLZTF().setText("");

			}

		});
		btnMybutton.setBounds(10, 10, 75, 25);
		btnMybutton.setText("MyButton");

		vornameTF = new Text(shlFrwindow, SWT.BORDER);
		vornameTF.setBounds(100, 41, 86, 21);

		Label vornameL = new Label(shlFrwindow, SWT.NONE);
		vornameL.setBounds(10, 44, 55, 15);
		vornameL.setText("Vorname");

		Label lblNachname = new Label(shlFrwindow, SWT.NONE);
		lblNachname.setBounds(10, 88, 75, 15);
		lblNachname.setText("Nachname");

		Label lblStrasse = new Label(shlFrwindow, SWT.NONE);
		lblStrasse.setBounds(10, 129, 55, 15);
		lblStrasse.setText("Strasse");

		NachnameTF = new Text(shlFrwindow, SWT.BORDER);
		NachnameTF.setBounds(100, 88, 86, 21);

		StrasseTF = new Text(shlFrwindow, SWT.BORDER);
		StrasseTF.setBounds(100, 126, 86, 21);

		Label lblHausnummer = new Label(shlFrwindow, SWT.NONE);
		lblHausnummer.setBounds(10, 173, 86, 15);
		lblHausnummer.setText("Hausnummer");

		HausnummerTF = new Text(shlFrwindow, SWT.BORDER);
		HausnummerTF.setBounds(100, 167, 86, 21);

		Label lblPlz = new Label(shlFrwindow, SWT.NONE);
		lblPlz.setBounds(10, 206, 55, 15);
		lblPlz.setText("PLZ");

		Label lblOrt = new Label(shlFrwindow, SWT.NONE);
		lblOrt.setBounds(10, 236, 55, 15);
		lblOrt.setText("Ort");

		PLZTF = new Text(shlFrwindow, SWT.BORDER);
		PLZTF.setBounds(100, 203, 86, 21);

		OrtTF = new Text(shlFrwindow, SWT.BORDER);
		OrtTF.setBounds(100, 230, 86, 21);

		Button btnAbbrechen = new Button(shlFrwindow, SWT.NONE);
		btnAbbrechen.setBackground(SWTResourceManager.getColor(255, 0, 0));
		btnAbbrechen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		btnAbbrechen.setBounds(100, 10, 75, 25);
		btnAbbrechen.setText("Abbrechen");

		Composite composite = new Composite(shlFrwindow, SWT.NONE);
		composite.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.println(me.x + "/" + me.y);
			}

		});
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		composite.setBounds(300, 80, 124, 129);

		VornameTFout = new Label(shlFrwindow, SWT.NONE);
		VornameTFout.setBounds(201, 44, 75, 15);

		NachnameTFout = new Label(shlFrwindow, SWT.NONE);
		NachnameTFout.setBounds(201, 94, 75, 15);

		StrasseTFout = new Label(shlFrwindow, SWT.NONE);
		StrasseTFout.setBounds(201, 129, 55, 15);

		HausnummerTFout = new Label(shlFrwindow, SWT.NONE);
		HausnummerTFout.setBounds(201, 173, 55, 15);

		PLZTFout = new Label(shlFrwindow, SWT.NONE);
		PLZTFout.setBounds(201, 206, 55, 15);

		OrtTFout = new Label(shlFrwindow, SWT.NONE);
		OrtTFout.setBounds(201, 236, 55, 15);

		Button btnJson = new Button(shlFrwindow, SWT.NONE);
		btnJson.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Gson gson = new GsonBuilder().setPrettyPrinting().create();

				File jsonFile;
				try {
					jsonFile = File.createTempFile("wpfinf-json-", ".humptydumpty");
					FileWriter fw = new FileWriter(jsonFile);
					gson.toJson(Person.getListe(), fw);
					fw.flush();
					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();

				}

				System.out.println(gson.toJson(Person.getListe()));
			}
		});
		btnJson.setBounds(300, 10, 75, 25);
		btnJson.setText("JSON");

		Button btnLoad = new Button(shlFrwindow, SWT.NONE);
		btnLoad.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog fd = new FileDialog(shlFrwindow, SWT.OPEN);

				fd.setFilterExtensions(new String[] { "*.humptydumpty" });
				fd.setFilterPath("%TEMP%");

				String filename = fd.open();

				System.out.println(filename);

				if (filename != null) {

					FileReader fr;
					try {
						fr = new FileReader(filename);
						Gson gson = new GsonBuilder().setPrettyPrinting().create();

						Person[] personen = gson.fromJson(fr, Person[].class);

						ArrayList<Person> personListe = new ArrayList<Person>(Arrays.asList(personen));

						System.out.println(personListe);
						
						Person.setListe(personListe);

					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		});
		btnLoad.setBounds(412, 10, 75, 25);
		btnLoad.setText("Load");
		shlFrwindow.setTabList(
				new Control[] { vornameTF, NachnameTF, StrasseTF, HausnummerTF, PLZTF, OrtTF, btnMybutton });

	}

	public Text getVornameTF() {
		return vornameTF;
	}

	public Text getNachnameTF() {
		return NachnameTF;
	}

	public Label getVornameTFout() {
		return VornameTFout;
	}

	public Label getNachnameTFout() {
		return NachnameTFout;
	}

	public Label getStrasseTFout() {
		return StrasseTFout;
	}

	public Label getHausnummerTFout() {
		return HausnummerTFout;
	}

	public Label getPLZTFout() {
		return PLZTFout;
	}

	public Label getOrtTFout() {
		return OrtTFout;
	}

	public Text getStrasseTF() {
		return StrasseTF;
	}

	public Text getHausnummerTF() {
		return HausnummerTF;
	}

	public Text getPLZTF() {
		return PLZTF;
	}

	public Text getOrtTF() {
		return OrtTF;
	}
}
