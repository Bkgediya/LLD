import java.io.FileWriter;
import java.io.IOException;

class FileStorage implements Persistance {

    @Override
    public void save(String data) {
        // Implementation to save data to a file
        try {
            // Code to save data to a file
            FileWriter writer = new FileWriter("data.txt");
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            // Handle exception
            System.out.println("Error saving data to file");
            e.printStackTrace();
        }
    }
}
