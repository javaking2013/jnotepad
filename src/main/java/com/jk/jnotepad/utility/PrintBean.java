package com.jk.jnotepad.utility;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JTextArea;

public class PrintBean implements Printable {
	
	JTextArea frameToPrint;
	
	public PrintBean(JTextArea f){
		frameToPrint = f;
	}
	
	public void printing(){
		PrinterJob pj =  PrinterJob.getPrinterJob();
		pj.pageDialog(pj.defaultPage());
		
		pj.setPrintable(this);
		
		boolean ok = pj.printDialog();
		if(ok){
			try{
				pj.print();
			}catch(PrinterException ex){
				ex.printStackTrace();
			}
		}
	}
	
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		if (pageIndex > 0){
			return NO_SUCH_PAGE;
		}
		
		Graphics2D g2d = (Graphics2D)graphics;
		g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
		
		frameToPrint.printAll(graphics);
		return PAGE_EXISTS;
	}
}
