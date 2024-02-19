#include <stdio.h>
#include <math.h>

void vayTienMuaXe()
{
    // Các thông số cố định
    double soTienVay = 500000000; // 500 triệu
    int thoiHanVay = 24 * 12;     // 24 năm
    double laiSuatNam = 0.072;    // 7.2%

    // Nhập thông số vay từ người dùng
    double phanTramVay;
    printf("Nhap vao so phan tram vay toi da (vi du: 80): ");
    scanf("%lf", &phanTramVay);

    // Tính toán
    double soTienTraTruoc = soTienVay * (1 - phanTramVay / 100);
    double soTienConLai = soTienVay - soTienTraTruoc;
    double laiSuatThang = laiSuatNam / 12;
    double laiHangThang = 0;
    double tienGocHangThang = soTienConLai / thoiHanVay;
    double tongTienTra = soTienTraTruoc;

    // In thông tin
    printf("\nTHONG TIN VAY MUA XE\n");
    printf("Thoi han vay: %d", thoiHanVay);
    printf("So tien vay: %.0lf VND\n", soTienVay);
    printf("So phan tram tra truoc: %.2lf%%\n", phanTramVay);
    printf("So tien tra truoc: %.0lf VND\n", soTienTraTruoc);
    printf("So tien con lai: %.0lf VND\n", soTienConLai);
    printf("Thoi han vay: %d thang\n", thoiHanVay);
    printf("Lai suat nam: %.2lf%%\n", laiSuatNam);

    // In bảng kế hoạch trả góp hàng tháng
    printf("\nBANG KE HOACH TRA GOP HANG THANG\n");
    printf("Thang\tLai Hang Thang\tTien Goc Hang Thang\tTong Tien Tra\n");

    for (int i = 1; i <= thoiHanVay; i++)
    {
        laiHangThang = soTienConLai * laiSuatThang;
        tongTienTra += laiHangThang + tienGocHangThang;
        soTienConLai -= tienGocHangThang;

        printf("%d\t%.0lf\t\t%.0lf\t\t\t%.0lf\n", i, laiHangThang, tienGocHangThang, tongTienTra);
    }
}

int main()
{
    vayTienMuaXe();
    return 0;
}
