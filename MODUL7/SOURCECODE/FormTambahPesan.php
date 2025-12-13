<?php
include "koneksi.php";
?>

<!DOCTYPE html>
<html>
<head>
    <title>Form Tambah Pesan</title>
</head>
<body>

<h2>Form Tambah Pesan</h2>

<form action="SimpanPesan.php" method="POST">

    <label>Pengirim</label><br>
    <select name="idPengirim" required>
        <option value="">-- Pilih Pengirim --</option>
        <?php
        $query = mysqli_query($koneksi, "SELECT * FROM user");
        while ($data = mysqli_fetch_assoc($query)) {
            echo "<option value='".$data['id']."'>".$data['username']."</option>";
        }
        ?>
    </select>
    <br><br>

    <label>Penerima</label><br>
    <select name="idPenerima" required>
        <option value="">-- Pilih Penerima --</option>
        <?php
        $query = mysqli_query($koneksi, "SELECT * FROM user");
        while ($data = mysqli_fetch_assoc($query)) {
            echo "<option value='".$data['id']."'>".$data['username']."</option>";
        }
        ?>
    </select>
    <br><br>

    <label>Judul Pesan</label><br>
    <input type="text" name="judul" required>
    <br><br>

    <label>Isi Pesan</label><br>
    <textarea name="TextPesan" rows="5" cols="40" required></textarea>
    <br><br>

    <label>Tanggal</label><br>
    <input type="date" name="date" required>
    <br><br>

    <button type="submit">Simpan Pesan</button>

</form>

</body>
</html>