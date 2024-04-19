package folders;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JFileChooser;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// reading the text file with its 25 elements
		
//		String textPath = "C:\\Users\\salah\\Pictures\\Screenshots\\captures d'ecran+\\Java\\bro code\\names.txt";
//		String guiPath = "C:\\Users\\salah\\Pictures\\Screenshots\\captures d'ecran+\\Java\\bro code\\gui\\";
//		FileReader fileReader;
//		BufferedReader br;
//		ArrayList<String> list = new ArrayList();
//		try {
//			fileReader = new FileReader(new File(textPath));
//			br = new BufferedReader(fileReader);
//			String line = null;
//			while( (line = br.readLine())!=null) {
//				list.add(line);
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		
		// creating the 25 directories
		
//		for(String s : list) {
//			String dirPath = guiPath+s;
//			File dir = new File(dirPath);
//			if(!dir.exists()) {
//				dir.mkdir();
//			}
//		}
		
		
		// 
		
//		String sourceFolderPath = "C:\\Users\\salah\\Pictures\\Screenshots\\captures d'ecran+\\Java\\one";
//		String destinationFolderPath = "C:\\Users\\salah\\Pictures\\Screenshots\\captures d'ecran+\\Java\\two";
//		Path sourcePath = Paths.get(sourceFolderPath);
//		Path destinationPath = Paths.get(destinationFolderPath);
//		
//		try {
//			Files.walk(sourcePath)
//				//.forEach(file -> Files.copy(file, destinationFolderPath));
//				.filter(Files::isRegularFile)
//				.forEach(file -> {
//					Path destinationFile = destinationPath.resolve(sourcePath.relativize(file));
//					try {
//						Files.copy(file, destinationFile);
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						
//					}
//				});
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		

		
		
		
		
//		JFileChooser fileChooser = new JFileChooser(); 
//		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
//		
//		Path sourcePathFolder = fileChooser.showDialog(null," Choose a directory to copy from") == JFileChooser.APPROVE_OPTION ? fileChooser.getSelectedFile().toPath(): null;
//		Path destinationPathFolder = fileChooser.showDialog(null, "choose a destination") == JFileChooser.APPROVE_OPTION? fileChooser.getSelectedFile().toPath() : null;
//		
//		
//		try {
//			Files.walk(sourcePathFolder)
//				.filter(Files::isRegularFile)
//				.forEach(file -> {
//					Path destinationFile = destinationPathFolder.resolve(file.getFileName());
//					try {
//						Files.copy(file, destinationFile);
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						
//					}
//				});
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		String srcPathString = "C:\\Users\\salah\\eclipse-workspace\\broCode\\src";
		String guiPathString = "C:\\Users\\salah\\Pictures\\Screenshots\\captures d'ecran+\\Java\\bro code\\gui";
		//File guiFolder = new File(guiPathString);
		
		Path guiPath = Paths.get(guiPathString);
		Path srcPath = Paths.get(srcPathString);
		
		try {
			Files.walk(guiPath)
				.filter(Files::isDirectory)
				.forEach(folder->{
					String fileAndFolderName = folder.getFileName().toString().replaceAll("[\\s\\d]+", "");
					Path folderPath = srcPath.resolve( Paths.get(fileAndFolderName) );
					Path filePath = srcPath.resolve( Paths.get(fileAndFolderName+"\\"+fileAndFolderName+".java"));
					
					if(! folderPath.toFile().exists()) {
						try {
							Files.createDirectories(folderPath);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(! filePath.toFile().exists()) {
						try {
							Files.createFile(filePath);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
