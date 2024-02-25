public class Main {

    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);

        System.out.print("Nama : ");
        String inputNama = objInput.nextLine();
        System.out.print("Jenis Kelamin (L/P) : ");
        String inputJenisKelamin = objInput.nextLine();
        System.out.print("Tanggal Lahir (yyyy-mm-dd) : ");
        String inputTanggalLahir = objInput.nextLine();

        String jenisKelamin = "";

        if ("P".equals(inputJenisKelamin)) {
            jenisKelamin = "Perempuan";
        } else if ("L".equals(inputJenisKelamin)) {
            jenisKelamin = "Laki-laki";
        }

        LocalDate tanggalLahir = LocalDate.parse(inputTanggalLahir);
        Period umur = Period.between(tanggalLahir, LocalDate.now());

        System.out.println("Nama : " + inputNama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur Anda : " + umur.getYears() + " tahun " + umur.getMonths() + " bulan");
    }
}