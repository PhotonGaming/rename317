// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

final class ShapedTile
{

    public ShapedTile(int i, int j, int k, int l, int i1, int j1, int k1,
                   int l1, int i2, int j2, int k2, int l2, int i3, int j3,
                   int k3, int l3, int i4, int k4, int l4)
    {
        aBoolean683 = !(i3 != l2 || i3 != l || i3 != k2);
        shapeA = j3;
        shapeB = k1;
        colourRGB = i2;
        colourRGBA = l4;
        char c = '\200';
        int i5 = c / 2;
        int j5 = c / 4;
        int k5 = (c * 3) / 4;
        int ai[] = anIntArrayArray696[j3];
        int l5 = ai.length;
        origVertexX = new int[l5];
        origVertexY = new int[l5];
        origVertexZ = new int[l5];
        int ai1[] = new int[l5];
        int ai2[] = new int[l5];
        int i6 = k4 * c;
        int j6 = i * c;
        for(int k6 = 0; k6 < l5; k6++)
        {
            int l6 = ai[k6];
            if((l6 & 1) == 0 && l6 <= 8)
                l6 = (l6 - k1 - k1 - 1 & 7) + 1;
            if(l6 > 8 && l6 <= 12)
                l6 = (l6 - 9 - k1 & 3) + 9;
            if(l6 > 12 && l6 <= 16)
                l6 = (l6 - 13 - k1 & 3) + 13;
            int i7;
            int k7;
            int i8;
            int k8;
            int j9;
            if(l6 == 1)
            {
                i7 = i6;
                k7 = j6;
                i8 = i3;
                k8 = l1;
                j9 = j;
            } else
            if(l6 == 2)
            {
                i7 = i6 + i5;
                k7 = j6;
                i8 = i3 + l2 >> 1;
                k8 = l1 + i4 >> 1;
                j9 = j + l3 >> 1;
            } else
            if(l6 == 3)
            {
                i7 = i6 + c;
                k7 = j6;
                i8 = l2;
                k8 = i4;
                j9 = l3;
            } else
            if(l6 == 4)
            {
                i7 = i6 + c;
                k7 = j6 + i5;
                i8 = l2 + l >> 1;
                k8 = i4 + j2 >> 1;
                j9 = l3 + j1 >> 1;
            } else
            if(l6 == 5)
            {
                i7 = i6 + c;
                k7 = j6 + c;
                i8 = l;
                k8 = j2;
                j9 = j1;
            } else
            if(l6 == 6)
            {
                i7 = i6 + i5;
                k7 = j6 + c;
                i8 = l + k2 >> 1;
                k8 = j2 + k >> 1;
                j9 = j1 + k3 >> 1;
            } else
            if(l6 == 7)
            {
                i7 = i6;
                k7 = j6 + c;
                i8 = k2;
                k8 = k;
                j9 = k3;
            } else
            if(l6 == 8)
            {
                i7 = i6;
                k7 = j6 + i5;
                i8 = k2 + i3 >> 1;
                k8 = k + l1 >> 1;
                j9 = k3 + j >> 1;
            } else
            if(l6 == 9)
            {
                i7 = i6 + i5;
                k7 = j6 + j5;
                i8 = i3 + l2 >> 1;
                k8 = l1 + i4 >> 1;
                j9 = j + l3 >> 1;
            } else
            if(l6 == 10)
            {
                i7 = i6 + k5;
                k7 = j6 + i5;
                i8 = l2 + l >> 1;
                k8 = i4 + j2 >> 1;
                j9 = l3 + j1 >> 1;
            } else
            if(l6 == 11)
            {
                i7 = i6 + i5;
                k7 = j6 + k5;
                i8 = l + k2 >> 1;
                k8 = j2 + k >> 1;
                j9 = j1 + k3 >> 1;
            } else
            if(l6 == 12)
            {
                i7 = i6 + j5;
                k7 = j6 + i5;
                i8 = k2 + i3 >> 1;
                k8 = k + l1 >> 1;
                j9 = k3 + j >> 1;
            } else
            if(l6 == 13)
            {
                i7 = i6 + j5;
                k7 = j6 + j5;
                i8 = i3;
                k8 = l1;
                j9 = j;
            } else
            if(l6 == 14)
            {
                i7 = i6 + k5;
                k7 = j6 + j5;
                i8 = l2;
                k8 = i4;
                j9 = l3;
            } else
            if(l6 == 15)
            {
                i7 = i6 + k5;
                k7 = j6 + k5;
                i8 = l;
                k8 = j2;
                j9 = j1;
            } else
            {
                i7 = i6 + j5;
                k7 = j6 + k5;
                i8 = k2;
                k8 = k;
                j9 = k3;
            }
            origVertexX[k6] = i7;
            origVertexY[k6] = i8;
            origVertexZ[k6] = k7;
            ai1[k6] = k8;
            ai2[k6] = j9;
        }

        int ai3[] = anIntArrayArray697[j3];
        int j7 = ai3.length / 4;
        indexA = new int[j7];
        indexB = new int[j7];
        indexC = new int[j7];
        anIntArray676 = new int[j7];
        anIntArray677 = new int[j7];
        anIntArray678 = new int[j7];
        if(i1 != -1)
            triTex = new int[j7];
        int l7 = 0;
        for(int j8 = 0; j8 < j7; j8++)
        {
            int l8 = ai3[l7];
            int k9 = ai3[l7 + 1];
            int i10 = ai3[l7 + 2];
            int k10 = ai3[l7 + 3];
            l7 += 4;
            if(k9 < 4)
                k9 = k9 - k1 & 3;
            if(i10 < 4)
                i10 = i10 - k1 & 3;
            if(k10 < 4)
                k10 = k10 - k1 & 3;
            indexA[j8] = k9;
            indexB[j8] = i10;
            indexC[j8] = k10;
            if(l8 == 0)
            {
                anIntArray676[j8] = ai1[k9];
                anIntArray677[j8] = ai1[i10];
                anIntArray678[j8] = ai1[k10];
                if(triTex != null)
                    triTex[j8] = -1;
            } else
            {
                anIntArray676[j8] = ai2[k9];
                anIntArray677[j8] = ai2[i10];
                anIntArray678[j8] = ai2[k10];
                if(triTex != null)
                    triTex[j8] = i1;
            }
        }

        int i9 = i3;
        int l9 = l2;
        if(l2 < i9)
            i9 = l2;
        if(l2 > l9)
            l9 = l2;
        if(l < i9)
            i9 = l;
        if(l > l9)
            l9 = l;
        if(k2 < i9)
            i9 = k2;
        if(k2 > l9)
            l9 = k2;
        i9 /= 14;
        l9 /= 14;
    }

    final int[] origVertexX;
    final int[] origVertexY;
    final int[] origVertexZ;
    final int[] anIntArray676;
    final int[] anIntArray677;
    final int[] anIntArray678;
    final int[] indexA;
    final int[] indexB;
    final int[] indexC;
    int triTex[];
    final boolean aBoolean683;
    final int shapeA;
    final int shapeB;
    final int colourRGB;
    final int colourRGBA;
    static final int[] screenX = new int[6];
    static final int[] screenY = new int[6];
    static final int[] veritceX = new int[6];
    static final int[] veritceZ = new int[6];
    static final int[] veritceY = new int[6];
    static final int[] anIntArray693 = {
        1, 0
    };
    static final int[] anIntArray694 = {
        2, 1
    };
    static final int[] anIntArray695 = {
        3, 3
    };
    private static final int[][] anIntArrayArray696 = {
        {
            1, 3, 5, 7
        }, {
            1, 3, 5, 7
        }, {
            1, 3, 5, 7
        }, {
            1, 3, 5, 7, 6
        }, {
            1, 3, 5, 7, 6
        }, {
            1, 3, 5, 7, 6
        }, {
            1, 3, 5, 7, 6
        }, {
            1, 3, 5, 7, 2, 6
        }, {
            1, 3, 5, 7, 2, 8
        }, {
            1, 3, 5, 7, 2, 8
        }, {
            1, 3, 5, 7, 11, 12
        }, {
            1, 3, 5, 7, 11, 12
        }, {
            1, 3, 5, 7, 13, 14
        }
    };
    private static final int[][] anIntArrayArray697 = {
        {
            0, 1, 2, 3, 0, 0, 1, 3
        }, {
            1, 1, 2, 3, 1, 0, 1, 3
        }, {
            0, 1, 2, 3, 1, 0, 1, 3
        }, {
            0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 
            4, 3
        }, {
            0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 
            2, 4
        }, {
            0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 
            2, 4
        }, {
            0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 
            4, 3
        }, {
            0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 
            4, 5, 1, 0, 5, 3
        }, {
            0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 
            3, 5, 1, 0, 4, 5
        }, {
            0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 
            2, 3, 1, 4, 3, 5
        }, {
            0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 
            2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 
            1, 4, 2, 3
        }, {
            1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 
            2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 
            0, 4, 2, 3
        }, {
            1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 
            4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 
            0, 1, 2, 5
        }
    };

}