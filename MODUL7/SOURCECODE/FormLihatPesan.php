<?php
include "koneksi.php";

$query = "
SELECT 
    p.idPesan,
    p.judul,
    p.TextPesan,
    p.date,
    u1.username AS pengirim,
    u2.username AS penerima
FROM pesan p
JOIN user u1 ON p.idPengirim = u1.id
JOIN user u2 ON p.idPenerima = u2.id
ORDER BY p.date DESC
";

$result = mysqli_query($koneksi, $query);
?>

<!DOCTYPE html>
<html>
<head>
    <title>Form Lihat Pesan</title>
</head>
<body>

<h2>Daftar Pesan</h2>

<table border="1" cellpadding="8">
    <tr>
        <th>ID Pesan</th>
        <th>Judul</th>
        <th>Isi Pesan</th>
        <th>Pengirim</th>
        <th>Penerima</th>
        <th>Tanggal</th>
        <th>Aksi</th>
    </tr>

    <?php while ($data = mysqli_fetch_assoc($result)) { ?>
    <tr>
        <td><?php echo $data['idPesan']; ?></td>
        <td><?php echo $data['judul']; ?></td>
        <td><?php echo $data['TextPesan']; ?></td>
        <td><?php echo $data['pengirim']; ?></td>
        <td><?php echo $data['penerima']; ?></td>
        <td><?php echo $data['date']; ?></td>
        <td>
            <a href="FormHapusPesan.php?id=<?php echo $data['idPesan']; ?>"
               onclick="return confirm('Yakin ingin menghapus pesan ini?')">
               Hapus
            </a>
        </td>
    </tr>
    <?php } ?>

</table>

</body>
</html>