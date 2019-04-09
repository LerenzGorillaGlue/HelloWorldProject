package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
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

	/**
	 * Launch the application.
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
		shlFrwindow.setSize(450, 300);
		shlFrwindow.setText("FrWindow");
	
		
		Button btnMybutton = new Button(shlFrwindow, SWT.NONE);
		btnMybutton.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btnMybutton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Knoppe gedrückt");
				System.out.println(vornameTF.getText());
				System.out.println(NachnameTF.getText());
				System.out.println(StrasseTF.getText());
				System.out.println(HausnummerTF.getText());
				System.out.println(PLZTF.getText());
				System.out.println(OrtTF.getText());
				
			
			
			}
		});
		btnMybutton.setBounds(10, 10, 75, 25);
		btnMybutton.setText("MyButton");
		
		vornameTF = new Text(shlFrwindow, SWT.BORDER);
		vornameTF.setBounds(100, 41, 131, 21);
		
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
		NachnameTF.setBounds(100, 88, 131, 21);
		
		StrasseTF = new Text(shlFrwindow, SWT.BORDER);
		StrasseTF.setBounds(100, 126, 131, 21);
		
		Label lblHausnummer = new Label(shlFrwindow, SWT.NONE);
		lblHausnummer.setBounds(10, 173, 86, 15);
		lblHausnummer.setText("Hausnummer");
		
		HausnummerTF = new Text(shlFrwindow, SWT.BORDER);
		HausnummerTF.setBounds(113, 167, 131, 21);
		
		Label lblPlz = new Label(shlFrwindow, SWT.NONE);
		lblPlz.setBounds(10, 206, 55, 15);
		lblPlz.setText("PLZ");
		
		Label lblOrt = new Label(shlFrwindow, SWT.NONE);
		lblOrt.setBounds(10, 236, 55, 15);
		lblOrt.setText("Ort");
		
		PLZTF = new Text(shlFrwindow, SWT.BORDER);
		PLZTF.setBounds(100, 200, 131, 21);
		
		OrtTF = new Text(shlFrwindow, SWT.BORDER);
		OrtTF.setBounds(94, 230, 137, 21);
		
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
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.println(me.x + "/" + me.y);
			}
			
		});
		composite.setBackground(SWTResourceManager.getColor(0, 0, 0));
		composite.setBounds(300, 80, 124, 129);
		shlFrwindow.setTabList(new Control[]{vornameTF, NachnameTF, StrasseTF, HausnummerTF, PLZTF, OrtTF, btnMybutton});

	}
}
