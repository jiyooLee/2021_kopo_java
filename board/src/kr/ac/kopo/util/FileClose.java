package kr.ac.kopo.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

import javax.swing.text.WrappedPlainView;

public class FileClose {

	public static void close(InputStream is) {
		
		if(is != null) {
			try {
				is.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(OutputStream os) {
		if(os != null) {
			try {
				os.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void close(InputStream bis, InputStream is) {
		FileClose.close(bis);
		FileClose.close(is);
	}
	
	public static void close(OutputStream bos, OutputStream os) {
		FileClose.close(bos);
		FileClose.close(os);
	}
	
	public static void close(Reader r) {
		if(r != null) {
			try {
				r.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Writer w) {
		if(w != null) {
			try {
				w.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Reader r, Writer w) {
		close(r);
		close(w);
	}
}





















