<?php
include "koneksi.php";

$idPengirim = $_POST['idPengirim'];
$idPenerima = $_POST['idPenerima'];
$judul      = $_POST['judul'];
$TextPesan  = $_POST['TextPesan'];
$date       = $_POST['date'];

$query = "INSERT INTO pesan 
          (idPengirim, idPenerima, judul, TextPesan, date)
          VALUES 
          ('$idPengirim', '$idPenerima', '$judul', '$TextPesan', '$date')";

$hasil = mysqli_query($koneksi, $query);

if ($hasil) {
    echo "<script>
            alert('Pesan berhasil disimpan');
            window.location='FormTambahPesan.php';
          </script>";
} else {
    echo "Gagal menyimpan pesan: " . mysqli_error($koneksi);
}
?>