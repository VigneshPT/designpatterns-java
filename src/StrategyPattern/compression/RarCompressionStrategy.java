package StrategyPattern.compression;

import java.io.File;
import java.util.ArrayList;

public class RarCompressionStrategy implements CompressionStrategy {

	@Override
	public void compressFiles(ArrayList<File> files) {
		// using RAR compression to compress files
		System.out.println("Compressing "+ files.size() + " files to a RAR file");
	}
	
}
