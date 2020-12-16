package com.xjl.leetcode;

/**
 * 767. 重构字符串
 *
 * @author xujianlin
 * @version 1.0
 * @date 2020/11/30 8:48
 */
public class Solution20 {
    public String reorganizeString(String S) {
        if (S.length() < 2) {
            return S;
        }
        int[] arrs = new int[27];
        int maxCount = 0;
        int maxIndex = 0;
        // 存储字符串里面各个字母出现的次数
        for (int i = 0; i < S.length(); i++) {
            arrs[S.charAt(i) - 'a']++;
            maxCount = Math.max(maxCount, arrs[S.charAt(i) - 'a']);
        }
        if (maxCount > (S.length() + 1) / 2) {
            return "";
        }

        StringBuffer res = new StringBuffer();


        int[] result = new int[S.length()];
        int preIndex;


        for (int i = 0; i < S.length(); i++) {
            preIndex = maxIndex;
            maxIndex = 26;
            // 找出数组中 不等于前面字符且最大的一个
            if (res.length() != 0) {
                for (int j = 0; j < arrs.length; j++) {
                    if (j != preIndex) {
                        maxIndex = arrs[j] >= arrs[maxIndex] ? j : maxIndex;
                    }
                }
            } else {
                for (int j = 0; j < arrs.length; j++) {
                    if (arrs[j] == maxCount) {
                        maxIndex = j;
                    }

                }
            }
            res.append((char) (maxIndex + 'a'));
            arrs[maxIndex]--;
        }

        return new String(res);
    }

    public static void main(String[] args) {
//       new Solution20().reorganizeString("aaass");
        System.out.println(new Solution20().reorganizeString("apyvzaaaabaaruraaaadwabldaralasahaaamrsaaaaaaaxaauwaaaafavaaabqieqkauyxgawdiabajakxmaaaawhabzaabaiahaaaarxmvamaanalaadahwbaadtarazjjavbswkaaaaacoaaakaazaramftialshqaaamlvhaankeaaaaaavayzadaaasathjaaanyaakrhueaiamaafapvaaaaeauaacyaaaroawaoaaadaagaaugkaaaamabbduaaacaaxaataauuaeaoaiqtlaaqqtarlaaaaajcaaaajgcgaodaadaoqasaaaalesaaapaascacavwdnnasxaayatawvikazaaadajatasanaaaamapuaavtaaseadzvaxaaaaapoaapsaaakraaakaiafataaaaaaaxljmgaaaavhaaalaeaaaazayazqaekqykzaaabsybvdxxvbaaaaajvaaidntlaagaaajzaleataek"));
        StringBuffer res = new StringBuffer();


        System.out.println();

    }
}
