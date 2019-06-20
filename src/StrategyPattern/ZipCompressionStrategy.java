package StrategyPattern;

import java.io.File;
import java.util.ArrayList;

public class ZipCompressionStrategy implements CompressionStrategy{

	@Override
	public void compressFiles(ArrayList<File> files) {
		// using the ZIP approach.
		System.out.println("Compressing "+ files.size() + " files to a ZIP file");
	}

}
