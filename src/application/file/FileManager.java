package application.file;

import java.io.File;

public interface FileManager {
	public void reName(File file);
	public void saveFile(File file);
	public void findSameFileName(File file);
}
