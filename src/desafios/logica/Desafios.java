
package desafios.logica;

/**
 *
 * @author IAN LUCCAS ARAÙJO
 */

public class Desafios {
    
    	public String stringTimes(String str, int n) {
		String res = "";
		for(int i=0;i<n;i++) {
			res = res + str;
		}
		
		return res;
		  
	}
        
        public String frontTimes(String str, int n) {
            String font = "";
            String res = "";
            if (str.length() >= 3){
                font = Character.toString(str.charAt(0)) + Character.toString(str.charAt(1)) + Character.toString(str.charAt(2));
            }else{
                font = str;
            }
            for(int i=0; i<n;i ++){
                res = res + font;
            }
            return res;
        }

        int countXX(String str) {
            
            int cont = 0;
            int tamanho = str.length();
            
            for(int i = 0; i < tamanho; i ++){
                
                if( i + 1 < tamanho){
                    if((str.charAt(i) == 'x') && (str.charAt(i+1) == 'x')){
                        cont ++;
                    }
                }
            }
            
            return cont;
  
        }
        
        
        public String stringSplosion(String str) {
            
            String res = "";
            
            for(int i = 0; i < str.length(); i ++){
                res = res + str.substring(0, i);
            }
            
            //OBS: O método 'substring' é muito útil
            
            return res + str;
        }
        
        public boolean array123(int[] nums) {
            
            boolean res = false;
            int tam = nums.length;
            
            for(int i = 0; i < tam; i ++){
                if(i+2 < tam){
                    if((nums[i] == 1) && (nums[i + 1] == 2) && (nums[i + 2] == 3)){
                        res = true;
                    }
                }
                
            }

            return res;
        }
        
        private boolean SubcountYZ(char aux){
            if(aux == 'y' || aux == 'z' || aux == 'Y' || aux == 'Z'){
                return true;
            }
            return false;
        }
        
        public int countYZ(String str) {
            int tam = str.length();
            int count = 0;
            
            for(int i = 0; i< tam; i ++){
                char aux = str.charAt(i);
                if(SubcountYZ(aux)){
                    if(i + 1 < tam){
                        char proximo_char = str.charAt(i + 1);
                        if(!Character.isLetter(proximo_char)){
                            count ++;
                        }
                    }
                    
                    if(i == tam - 1){
                        count ++;
                    }
                }
                
            }
            return count;
            
        }
        
        private boolean par(int i){
            int res = i % 2;
            //System.out.println("Para " + i + ", o resto é igual a " + res);
            if (res == 0){
                return true;
            }
            return false;
        }

        public int countEvens(int[] nums) {
            int tam = nums.length;
            int count = 0;
            for(int i = 0; i< tam; i ++){
                if(par(nums[i])){
                    count ++;
                }
            }
            return count;
        }
        
        public void mostrarArray(int[] nums){
            for(int i = 0; i < nums.length; i ++ ){
                System.out.print(nums[i]);
            }
        }
        
        private int positionNumber4(int[] nums, int positionNumber3){
            for(int i = positionNumber3; i < nums.length; i ++){
                if(nums[i] == 4){
                    return i;
                }
            }
            return -1;
        }
        
        private int positionNumber3(int[] nums, int positionNumber4){
            for(int i = positionNumber4; i < nums.length; i ++){
                if(nums[i] == 3){
                    return i;
                }
            }
            return -1;
        }
        
        private int[] rearranged(int[] nums, int position3, int position4, String sentidoDo4){
            int aux;
            if(sentidoDo4 == "direita"){
                for(int i = position4; i - 1 > position3; i--){
                    aux = nums[i - 1];
                    nums[i - 1] = 4;
                    nums[i] = aux;
                }
            }
            if(sentidoDo4 == "esquerda"){
                for(int i = position4; i < position3; i++){
                    if(i < position3 - 1){
                        aux = nums[i + 1];
                        nums[i + 1] = 4;
                        nums[i] = aux;
                    }else{
                        nums[i] = nums[i + 2];
                        nums[i + 2] = 4;
                    }
                }
            }

            return nums;
        }
        
        public int[] fix34(int[] nums) {
            int tam = nums.length;
            int position4;
            
            for(int i = 0; i < tam; i ++){
                if(nums[i] == 3){
                    position4 = positionNumber4(nums, i);
                    nums = rearranged(nums, i, position4, "direita");
                    i = i + 2;
                }
                if(nums[i] == 4){
                    position4 = i;
                    nums = rearranged(nums, positionNumber3(nums, position4), position4, "esquerda");
                    i = positionNumber3(nums,i) + 2;
                }
            }
            return nums;
        }

    
}
