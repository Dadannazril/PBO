public class Databuku{
	public static void main(String[]args){
		Buku datbuk=new Buku();
		
		datbuk.setIdbuku(12345);
		datbuk.setJudulbuku("Pemrograman WEB");
		datbuk.setPenulis("Didik Setiawan");
		datbuk.setJenisbuku("Pemrograman");
		datbuk.setTahunterbit(2018);
		datbuk.setPenerbit("Start UP");
		
		int    id=datbuk.getIdbuku();
		String judul=datbuk.getJudulbuku();
		String penulis=datbuk.getPenulis();
		String jenis=datbuk.getJenisbuku();
		int    tahunterbit=datbuk.getTahunterbit();
		String penerbit=datbuk.getPenerbit();
		
		System.out.println();
		System.out.println("---- DATA BUKU ----");
		System.out.println("---- --------- ----");
		System.out.println("Id Buku      :"+id);
		System.out.println("Judul Buku   : "+judul);
		System.out.println("Penulis      : "+penulis);
		System.out.println("Jenis Buku   : "+jenis);
		System.out.println("Tahun terbit : "+tahunterbit);
		System.out.println("Penerbit     : "+penerbit);
	}
}