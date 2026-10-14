public abstract class Kargo {

    int takipNumarasi;
    double agirlik;

   Kargo(int takipNumarasi, double agirlik){

       if(agirlik<=0){
           throw new IllegalArgumentException("Ağırlık negatif bir değer olamaz!");
       }

        this.agirlik=agirlik;
        this.takipNumarasi=takipNumarasi;
   }

   abstract double ucretHesapla();

   abstract int tahminiTeslimSuresi();
}
