import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ImageFrame();
			}
		});
		
	}
}