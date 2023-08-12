* L[i] = 1 voi moi i thuoc [0; n-1]
     * xét dựa trên việc: bạn xét các phần tử trước i xem cái chỉ 
     * số dãy con dài nhất là bao nhiêu rồi? 
     * Cong thuc xac dinh:
     * L[i] = max(L[i],L[j] + 1) 
     * 
     * Vòng i là xét tới chỉ số nào. Vòng j là để xét các chỉ số trước i
     * để tính dãy con tăng dài nhất
     * voi L[j] la do dai LIS truoc i. aj < ai. 
     * 
     * Base case: L[i] = 1 Voi moi i tu 0 -> n-1
     * Áp dụng vào bài dưới:
     * 1 3 2 8 4 5
     * 
     * bai lam
     * 
     * ban dau:
     * int[] L ={ 1 1 1 1 1 1 }
     * Xet chi so a[0]: a0 < a1 -> L1 = max(L1,L0 + 1)
     * trong khi do L[1] = 1 -> L1 = 2
     * L ={ 1 2 1 1 1 1 } tức là dãy con tăng dài nhất kết thúc
     * ở chỉ số i = 1 là 2. (1,3)
     * 
     * i = 2: gia tri 2
     * arr0 < arr2 -> L2 = max(L2,L0+1) -> 2
     * L ={ 1 2 2 1 1 1 }
     * 
     * i = 3: gia tri 8:
     * arr0 
     */
