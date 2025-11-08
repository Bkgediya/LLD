class DbStorage implements Persistance {

    @Override
    public void saveData(String data) {
        try {
            // Save data to database
        } catch (SQLException e) {
            // Handle exception
            System.out.println("Error saving data to database");
            e.printStackTrace();
        }
    }
}
