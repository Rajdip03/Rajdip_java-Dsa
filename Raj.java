// class Raj
// {
//     static int a=8; //static variable
//     int b=3; //instance variable
//     void check()
//     {
//         int c=9; //local varible
//         System.out.println(c);
//         System.out.println(b);    
//     }
//     public static void main(String[] args) {
//        Raj r=new Raj();
//        r.check();
//       // r.check();
//        System.out.println(a);
       
//     }   
// }
//fibonachi series---> 0 1 1 2 3 5 8
// import java.util.Scanner;
// class Raj 
// {
//     public static void main(String [] args){
//         int n;
//         int a=0,b=1,c;
//         System.out.println("Enter your number");
//         Scanner sc = new Scanner(System.in);
//         n=sc.nextInt();
//         for(int i=0;i< n;i++){
//             System.out.print(a +" ");
//             c=a+b;
//             a=b;
//             b=c;
//         }
//     }
// }
// class Raj 
// {
//     public static void main (String[] args){
//         int a=0,b=1,c=2,d;
//          int n;
//         System.out.println("Enter your number");
//         Scanner sc = new Scanner(System.in);
//         n=sc.nextInt();
//         for(int i = 0; i<=n ; i++)
//         {
//             System.out.println(a);
//             d = a+b+c;
//             a=b;
//             b=c;
//             c=d;
//         }
//     }
// }
// import java.util.Scanner;
// class Raj 
// {
//     public static void main(String[] args) {
//        int n;
      
//        System.out.print("Enter your number");
//        Scanner sc =new Scanner(System.in);
//        n=sc.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            if(n%i==0)
//             {
//                 System.out.print(" "+ i);
//             }
//        }
//     }
// }    
//sub string

// import java.util.*;
// class Raj 
// {
//     public static void main(String [] args){
//         String str;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name");
//         str=sc.nextLine();
//         for(int i =0; i<str.length();i++)
//         {
//             String temp="";
//             for(int j=i; j< str.length();j++)
//             {
//                 temp +=str.charAt(j);
//                 System.out.println(temp);
//                 // System.out.println(str.substring(i , j));
//             }
//         }
//     }
// } 

// number of uniquecharecter

// import java.util.*;
// class Raj 
// {
//     public static void main (String [] args){
//         String str;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a name");
//         str=sc.nextLine();
//         str=str.toLowerCase();
//         HashSet<Character> uniquecharacter = new HashSet<>();
//         for(char ch: str.toCharArray())
//         {
//             if(Character.isLetterOrDigit(ch))
//             {
//                 uniquecharacter.add(ch);
//             }
//         }
//         System.out.println(uniquecharacter);
//         System.out.println(uniquecharacter.size());
//     }
// }

 // only appear one time number of uniquecharecter

//  import java.util.*;
//  class Raj 
//  {
//     public static void main(String[] args){
//         String str;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a name");
//         str=sc.nextLine();
//         str=str.toLowerCase();

//         int freq [] = new int[256];
//         for(int i =0; i< str.length(); i++)
//         {
//             char ch = str.charAt(i);
//             if(ch !=' ')
//             {
//                 freq[ch]++;
//             }
//         }
//         int uniqueCount = 0;
//         for(int i =1; i< str.length();i++)
//         {
//             char ch =str.charAt(i);
//             if(freq[ch]==1)
//             {
//                 uniqueCount ++;
//                 System.out.print(ch + " ");
//             }
//         }
//         System.out.println("uniqueCount : "  +  uniqueCount);
//     }
//  }

// class Raj 
// {
//     public static void main(String[] args) {
//         String str ="i am a best developer";
//         String oldSub ="a";
//         String newSub = "the";
//         String result= "";
//         int count =0;
//         int n =1;
//          for (int i = 0; i < str.length(); i++) {
//             boolean match = true;
//             for (int j = 0; j < oldSub.length(); j++) {
//                 if(i+j >=str.lenght() || str.charAt(i)!= oldSub.charAt(j))
//                 {
//                     match = false;
//                     break;
//                 }
//             }
//             if (match && count < n) {
                
//             }
//          }
//     }
// }

// reverse each string
// class Raj 
// {
//     public static void main(String[] args) {
//         String str="java is best";
        
//         String words []= str.split(" ");
//         // String result="";
//         for (String word : words) {
//             String rev="";
//             for(int i = word.length()-1; i>=0;i--)
//             {
//                 rev+= word.charAt(i);
//             }
//             System.out.print(rev + " ");
//         }
        
//     }
// }
// count even and odd length

// class Raj 
//  {
//     public static void main(String[] args) {
//         String str="java is fun";
//         String words[]= str.split(" ");
//         int even=0;
//         int odd=0;
//         for (String word : words) 
//         {
//             if(word.length() % 2 == 0)
//             {
//                 even++;
//             }
//             else
//             {
//                  odd++;
//             }
//         }
//         System.out.println(even);
//         System.out.println(odd);

//     }
//  }
// // convert all vowels to uppercase
// class Raj
// {
//     public static void main(String[] args) {
//         String str="Rajdip".toLowerCase();
//          String result="";
        
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if("aeiou".indexOf(ch)!=-1)
//             {
//                 result += Character.toUpperCase(ch);
//             }
//             else 
//             {
//                 result +=ch;
//             }
//         }
//         System.out.println(result);
//     }
// }
//<--------- romove vowels from a string------>
// class Raj
// {
//    public static void main(String[] args) {

//       String name = "RAjdip";
//       String result = "";
//       // for(int i =0; i< name.length(); i++)
//       // {
//       //    char ch = name.charAt(i);
//       //    if("aeiou".indexOf(ch) == -1)
//       //    {
//       //       result += ch;
//       //    }
//       // }   
//       for(char ch : name.toCharArray())
//       {
//          if("aeiou".indexOf(ch)== -1)
//          {
//             result +=ch;
//          }   
//       }
//       System.out.println(result);
//    }
// }
//<----- missing number of array ---->
// class Raj 
// {
//    public static void main(String[] args) {
//       int arr[]={1,2,4,5,6};
//       int n = arr.length + 1; // to get original length of array because one element is missing thats why add +1
//       int totalSum = n * (n+1) / 2; //21
//       int arrSum = 0;
//       for(int x : arr)
//       {
//          arrSum += x; 
//       }
//       System.out.println(arrSum);
//    }
// }
//<-------nth term--->
// class Raj 
// {
//    public static void main(String[] args) {
//       int n =10;
//       int series []= new int [10];
//       series[0]=1;
//       series[1]=0;
//       for(int i=2; i< n ; i++)
//       {
//          series[i] = series[i-1] + series[i-2] + i*10;
//       }
//       for(int result : series)
//       {
//          System.out.print(result +" ");
//       }
//    }
// } 
// import java.util.*;
// class Raj 
// {
//    public static void main(String[] args) {
//       Scanner sc =new Scanner(System.in);
//       System.out.println("Enter your number of terms (n) : ");
//       int n = sc.nextInt();
//       sc.close();

//       generateSeries(n);
//    }
//    public static void generateSeries(int n)
//    {
//       int termA = 1;
//       int commonDiffA = 21;

//       int termB =0;
//       int diffB = 23;
//       int seconddiffB =42;

//       for(int i=1; i<=n; i++ )
//       {
//          if(i % 2 !=0)
//          {
//             System.out.println(termA);
//             termA +=commonDiffA;
//          }
//          else
//          {
//             System.out.println(termB);
//             termB += diffB;
//             diffB +=seconddiffB;
//          }
//          if (i < n) 
//          {
//           System.out.print(", ");  
//          }
//       }
//       System.out.print("......");
      
//    }
// }
//<----birth year in fibonachi series--->
// import java.util.*;
// class Raj 
// {
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter your birth year");
//       int year = sc.nextInt();
//       int a =0; int b= 1; int c= 0;
//       while(c < year)
//       {
//          System.out.print(c +" ");
//          c=a+b;
//          a=b;
//          b=c;
//       }
//       if(c == year)
//       {
//          System.out.println(year + " is a fibonachi year");
//       }
//       else 
//       {
//          System.out.println(year + " not a fibonachi year");
//       }
//       sc.close();
//    }
// }
// count vowels and consonant
// class Raj 
// {
//     public static void main(String[] args) {
//         String str= "java is fun";
//         int vowels =0;
//         int consonant = 0;
//         for(int i=0;i<str.length();i++)
//         {
//             char ch =str.charAt(i);
//             if(ch!=' ')
//             {
//                 if("aeiou".indexOf(ch)!=-1)
//                 {
//                 vowels++;
//                 }
//                 else 
//                 {
//                consonant++;
//                 }
//             }
//         }
//         System.out.println(vowels);
//         System.out.println(consonant);
//     }
// }
// check anagrams
// import java.util.Arrays;
// class Raj 
// {
//     public static void main(String[] args) {
//         String str1="listen";
//         String str1="silent";

//         char  [] a =str1.toLowerCase().toCharArray();
//         char [] b =str2.toLowerCase().toCharArray();

//         Arrays.sort(a);
//         Arrays.sort(b);

//         if(Arrays.equals(a,b))
//         {
//             System.out.println("anagrams");
//         }
//         else 
//         {
//           System.out.println("not anagrams");
//         }

//     }
// }

// class Raj
// {
//     int a;
//     int b ;

//     Raj()
//     {
//         a =5;
//         b=3;
//         int sum=a+b;
//     }
//     Raj(Raj ref)
//     {
//         a=ref.a;
//         b= ref.b;
//         System.out.println(a+b);
//     }
//     public static void main(String[] args) {
//         Raj r = new Raj();
//         Raj r2 = new Raj(r);

//     }
// }
// abstract class learn
// {
//     public abstract void sound();
// }
// class Raj extends learn 
// {
    
//     public void sound()
//     {
//         System.out.println("tiger sound is Roar type");
//     }
//     public static void main(String[] args) {
//         Raj r = new Raj();
//         r.sound();
//     }
// }

//  interface learn
// {
//  public abstract void sound();    
// }
//  interface multiple
// {
//  public abstract void sound();    

// }
// class Raj implements learn,multiple
// {
//  public void sound()
//  {
//     System.out.println("tiger sound is roar");
//  }
//  public static void main(String[] args) {
//     Raj r = new Raj();
//     r.sound();
//  }
// }
//<-----practice for tommorrow interview--->
//merge two sorted array
// class Raj{
//    public static void main(String[] args) {
//       int a[]={1,3,5,7};
//       int b[]={2,4,6,8};
//       int c[]=new int[a.length + b.length ];
//       int i=0,j=0,k=0;
//       while(i < a.length && j<b.length )
//       {
//          c[k++]= (a[i] < b[j]) ? a[i++] : b[j++];
//       }
//       while (i < a.length) 
//       {
//          c[k++]=a[i++];
//       }
//       while (j < b.length) 
//       {
//        c[k++]=b[j++]; 
//       }
//       for (int result : c) {
//          System.out.print(result + " ");
//       }
//    }
// }
//<--- nth term series--->

// import java.util.Scanner;

// class Raj 
// {
//    public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter your number of series (n): ");
//       int n =sc.nextInt();
       
//       generateSeries(n);
//    }
//    public static void generateSeries(int n)
//    {
//       //odd
//       int termA=1;
//       int commonDiffA=21;

//       //even
//       int termB=0;
//       int diffB=23;
//       int seconddiffB=42;

//       for(int i=0; i<=n; i++)
//       {
//          if(i % 2 != 0)
//          {
//             System.out.println(termA);
//             termA +=commonDiffA;
//          }
//          else 
//          {
//             System.out.println(termB);
//             termB +=diffB;
//             diffB +=seconddiffB;
//          }
//          if(i < n)
//          {
//             System.out.print(", ");
//          }
//       }
//       System.out.print("......");
//    }
// }
//<---missing element in array --->
// class Raj 
// {
//    public static void main(String[] args) {
//       int arr[]={1,2,4,5,6,7,8};
//       int n = arr.length +1;
//       int totalSum= n*(n+1)/2;
//       int arrSum=0;
//       for (int result : arr) 
//       {
//          arrSum += result;
//       }
//       System.out.println(totalSum-arrSum + ": missing element of array");
//    }
// }
//<---romove vowels--->
// class Raj 
// {
//    public static void main(String[] args) {
//       String name ="Rajdip";
//       String result="";
//       for (char ch : name.toCharArray())
//       {
//          if("aeiouAeiou".indexOf(ch)==-1)
//          {
//             result +=ch;
//          }
//       }
//       System.out.println(result);
//    }
// }
//<---birth year in fibonachi series--->

// import java.util.Scanner;

// class Raj 
// {
//    public static void main(String[] args) {
//       Scanner sc =new Scanner(System.in);
//       System.out.println("enter birth year");
//       int year =sc.nextInt();
//       int a=0,b=1,c=0;
//       while(c < year)
//       {
//          System.out.println(c);
//          c=a+b;
//          a=b;
//          b=c;
//       }
//       if(c == year)
//       {
//          System.out.println(year +" : is a fibonachi year");
//       }
//       else 
//       {
//          System.out.println(year +" : Not a fibonachi year");
//       }
//    }
// }