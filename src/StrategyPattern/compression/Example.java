package StrategyPattern.compression;

import java.io.File;
import java.util.ArrayList;

/**
 * Strategy pattern provides a way to define a family of algorithms, encapsulate each as an object,
 * and make them interchangeable.
 * 
 * The Strategy pattern is to be used where you want to choose the algorithm in runtime.
 * A good use of the Strategy Pattern would be saving files in different formats, running various 
 * sorting algorithms, or file compression.
 * 
 * Steps to explain in code:
 * 1. Create CompressionStrategy interface file, and declare `compressFiles` method.
 * 2. Create ZipCompressionStrategy class and implement CompressionStrategy.
 * 3. Define the compressFiles method in ZIP way.
 * 4. Create RarCompressionStrategy and do the same.
 * 5. Create CompressionContext class, and declare `strategy` private variable.
 * 6. Create `setCompressionStrategy(CompressionStrategy x)` method, and set this.strategy
 * 7. Create `createArchive` method and call strategy.compressFiles() method.
 * 8. Create Example class with static main method. 
 * 9. Create CompressionContext object, and set the compression strategy by 
 * 		context.setCompressionStrategy(new ZipCompressionStrategy);
 * 10. Call context.createArchive()
 * @author vigneshpt
 *
 */

public class Example {
	public static void main(String[] args) {
		CompressionContext ctx = new CompressionContext();
		ctx.setCompressionStrategy(new RarCompressionStrategy());
		
		ArrayList<File> files = new ArrayList<File>();
		files.add(new File(""));
		files.add(new File(""));
		
		ctx.createArchive(files);
	}
}
