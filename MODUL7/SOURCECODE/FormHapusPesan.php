<?php
include "koneksi.php";

if (isset($_GET['id'])) {
    $idPesan = $_GET['id'];

    $query = "DELETE FROM pesan WHERE idPesan = '$idPesan'";
    $hapus = mysqli_query($koneksi, $query);

    if ($hapus) {
        echo "<script>
                alert('Pesan berhasil dihapus');
                window.location='FormLihatPesan.php';
              </script>";
    } else {
        echo "<script>
                alert('Gagal menghapus pesan');
                window.location='FormLihatPesan.php';
              </script>";
    }
} else {
    header("Location: FormLihatPesan.php");
}
?>