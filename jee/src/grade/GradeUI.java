package grade;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

/**
 * @date   :2016. 7. 6.
 * @author :ckan
 * @file   :GradeUI.java 
 * @story  :
 */
public class GradeUI extends JFrame{
	JPanel wrapper_panel,flow_panel;
	JList<String> itemList; 
	TableModel MyTableModel;
	private static final long serialVersionUID = 1L;
	public GradeUI() {
		this.setLayout();
		this.setResizable(false);//frame abort resize
		this.setLocationRelativeTo(null);//frame load at center of screen
		this.setSize(800, 300);//frame set size width, height
		this.setVisible(true);//frame set visible mode (false - non-visible)
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);//x btn of frame is end of frame
	}
	private void setLayout() {
		wrapper_panel = new JPanel();
		flow_panel = new JPanel(new FlowLayout());
		itemList = new JList(GradeServiceImpl.getInstance().list().toArray());
		itemList.setSelectedIndex(0);
		itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		wrapper_panel.add(itemList);
		this.add(wrapper_panel);

	}
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
