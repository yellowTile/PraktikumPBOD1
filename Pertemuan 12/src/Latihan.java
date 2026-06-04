import java.util.HashMap;
import java.util.Map;


public class Latihan {
    public static void main(String[] args) {
   
        Map<String, String> mahasiswaMap = new HashMap<>();
        
     
        mahasiswaMap.put("2025001", "Adi");
        mahasiswaMap.put("2025002", "Bambang");
        mahasiswaMap.put("2025003", "Cici");
        mahasiswaMap.put("2025004", "Didi");
     
    
        mahasiswaMap.forEach((nim, nama) -> 
            System.out.println("NIM: " + nim + ", Nama: " + nama)
        );
    }
}