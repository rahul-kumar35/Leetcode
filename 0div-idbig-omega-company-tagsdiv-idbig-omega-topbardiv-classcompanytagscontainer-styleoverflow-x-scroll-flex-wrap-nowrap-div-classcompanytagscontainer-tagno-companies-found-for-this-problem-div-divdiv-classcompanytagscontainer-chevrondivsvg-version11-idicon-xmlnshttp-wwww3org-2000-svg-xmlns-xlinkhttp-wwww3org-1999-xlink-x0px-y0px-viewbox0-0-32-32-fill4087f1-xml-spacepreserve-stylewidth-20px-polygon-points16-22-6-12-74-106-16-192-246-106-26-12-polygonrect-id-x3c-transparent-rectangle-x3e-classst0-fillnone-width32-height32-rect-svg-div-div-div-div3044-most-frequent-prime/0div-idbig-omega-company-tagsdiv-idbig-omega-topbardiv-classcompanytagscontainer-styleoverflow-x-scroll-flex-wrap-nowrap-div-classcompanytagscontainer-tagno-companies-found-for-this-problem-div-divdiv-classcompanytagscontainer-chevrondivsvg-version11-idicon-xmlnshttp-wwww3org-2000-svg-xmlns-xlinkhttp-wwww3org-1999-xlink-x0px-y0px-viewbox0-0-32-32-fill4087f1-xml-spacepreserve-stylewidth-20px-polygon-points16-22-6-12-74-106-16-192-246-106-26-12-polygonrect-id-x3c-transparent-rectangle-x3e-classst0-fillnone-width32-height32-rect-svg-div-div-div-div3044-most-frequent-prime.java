class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    
    public int mostFrequentPrime(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                move1(i,j,m,n,mat[i][j],mat);
                move2(i,j,m,n,mat[i][j],mat);
                move3(i,j,m,n,mat[i][j],mat);
                move4(i,j,m,n,mat[i][j],mat);
                move5(i,j,m,n,mat[i][j],mat);
                move6(i,j,m,n,mat[i][j],mat);
                move7(i,j,m,n,mat[i][j],mat);
                move8(i,j,m,n,mat[i][j],mat);
            }
        }   
        int k=-1;
        int ans = 0;
        for(int key : map.keySet()){
            if(map.get(key)>ans){
                ans = map.get(key);
                k = key;
            }
            if(map.get(key)==ans && key>k){
                k=key;
            }
        }
        return k;
        
    }
    
    
    
    public boolean isPrime(int key){
        int c = 2;
        while(c*c <= key){
            if(key%c == 0) return false;
            c++;
        }
        return true;
    }
    
    public void move1(int i, int j, int m, int n, int curr,int[][] mat){
        if(j<n-1){
            int x = curr*10 + mat[i][++j];
            if(isPrime(x))
            map.put(x, map.getOrDefault(x, 0)+1);
            curr = x;
            move1(i,j,m,n,curr,mat);
        }
        return ;
    }
    
    public void move2(int i, int j, int m, int n, int curr,int[][] mat){
        if(j<n-1 && i<m-1){
            int x = curr*10 + mat[++i][++j];
             if(isPrime(x))
                map.put(x, map.getOrDefault(x, 0)+1);
            curr = x;
            move2(i,j,m,n,curr,mat);
        }
        return ;
    }
    public void move3(int i, int j, int m, int n, int curr,int[][] mat){
        if(i<m-1){
            int x = curr*10 + mat[++i][j];
             if(isPrime(x))
            map.put(x, map.getOrDefault(x, 0)+1);
            curr = x;
            move3(i,j,m,n,curr,mat);
        }
        return ;
    }
    public void move4(int i, int j, int m, int n, int curr,int[][] mat){
        if(i<m-1 && j>0){
            int x = curr*10 + mat[++i][--j];
             if(isPrime(x))
            map.put(x, map.getOrDefault(x, 0)+1);
            curr = x;
            move4(i,j,m,n,curr,mat);
        }
        return ;
    }
    public void move5(int i, int j, int m, int n, int curr,int[][] mat){
        if(j>0){
            int x = curr*10 + mat[i][--j];
             if(isPrime(x))
            map.put(x, map.getOrDefault(x, 0)+1);
            curr = x;
            move5(i,j,m,n,curr,mat);
        }
        return;
    }
    public void move6(int i, int j, int m, int n, int curr,int[][] mat){
        if(i>0 && j>0){
            int x = curr*10 + mat[--i][--j];
             if(isPrime(x))
            map.put(x, map.getOrDefault(x, 0)+1);
            curr = x;
            move6(i,j,m,n,curr,mat);
        }
        return; 
    }
    public void move7(int i, int j, int m, int n, int curr,int[][] mat){
        if(i>0){
            int x = curr*10 + mat[--i][j];
             if(isPrime(x))
            map.put(x, map.getOrDefault(x, 0)+1);
            curr = x;
            move7(i,j,m,n,curr,mat);
        }
        return;
    }
    public void move8(int i, int j, int m, int n, int curr,int[][] mat){
        if(i>0 && j<n-1){
            int x = curr*10 + mat[--i][++j];
             if(isPrime(x))
            map.put(x, map.getOrDefault(x, 0)+1);
            curr = x;
            move8(i,j,m,n,curr,mat);
        }
        return;
    }
}