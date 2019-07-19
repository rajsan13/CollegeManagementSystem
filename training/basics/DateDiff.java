package training.basics;

public class DateDiff {
public static void main(String[] args) {
	int d1=13,m1=6,y1=1998,d2=15,m2=7,y2=2019;
	int flag1=0,flag2=0;
	int[] arr= {31,29,31,30,31,30,31,31,30,31,30,31};
	if(y2%4==0 && y2%100==0 && y2%400==0)
		flag2=1;
	if(y2%4==0 && y2%100!=0)
		flag2=1;
	if(y1%4==0 && y1%100==0 && y1%400==0)
		flag1=1;
	if(y1%4==0 && y1%100!=0)
		flag1=1;
	int sumd1=0;
	int ydiff=Math.abs(y2-y1)*365;
	for(int i=1;i<=m1-1;i++)
	{
		sumd1=sumd1+arr[i-1];
	}
	int sumd2=0;
	for(int i=1;i<=m2-1;i++)
	{
		sumd2=sumd2+arr[i-1];
	}
	int sumdiff=Math.abs(sumd2-sumd1);
    int daydiff=Math.abs(d2-d1);
    int ans=0;
    if(flag1==flag2)
    {
    ans=daydiff+sumdiff+ydiff;	
    }
    else
    {
    	ans=daydiff+sumdiff+ydiff+1;	
    }
    System.out.println(ans+" days");
}
}
