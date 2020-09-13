#include<stdio.h>
#include<string.h>
long long int dp[1001];
int main()
{
	int n,k,i,j;
	while(scanf("%d%d",&n,&k)!=EOF)
	{
		memset(dp,0,sizeof(dp));
		dp[0]=1;dp[1]=1;
		for(i=1;i<=n;i++)
		{
			if(i<=k)
			{
				dp[i]=1;
				for(j=2;j<=i;j++)
				{
					dp[i]*=2;
				}
				dp[i]=dp[i]%10000 00007;
			}
			else
			{
				for(j=1;j<=k;j++)
				{
					dp[i]+=dp[i-j]%1000000007;
				}
				dp[i]=dp[i]%1000000007;
			}
		}
		printf("%lld\n",dp[n]);
	}
	return 0;
}