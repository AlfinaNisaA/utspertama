class Main {
    public static void main(String[] args) {
    Mhs mhs = new(username:"ini_username", password:"ini_password");

    mhs.setNama(nama:"Alfina Nisa");
    mhs.setNim(nim:"G111190047");
    mhs.setSmt(smt:3);

    System.out.println("Nama Mhs: " +mhs.getNama());
    System.out.println("Nim Mhs: " +mhs.getNim());
    System.out.println("Smt Mhs: " +mhs.getSmt());
    System.out.println("Username: " +mhs.getUsername());
    System.out.println("Password: " +mhs.getPassword());



    }
}