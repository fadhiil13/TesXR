interface Book {
    id: number;
    judul: string;
    kategori: string;
    harga: number;
    stok: number;
}

const books: Book[] = [
    { id: 1, judul: "TS Dasar", kategori: "Pemrograman", harga: 150000, stok: 10 },
    { id: 2, judul: "NestJS Lanjutan", kategori: "Web", harga: 200000, stok: 5 },
    { id: 3, judul: "Data Structures", kategori: "Ilmu Komputer", harga: 100000, stok: 8 },
    { id: 4, judul: "ReactJS Pemula", kategori: "Web", harga: 175000, stok: 12 },
    { id: 5, judul: "Algoritma Lanjut", kategori: "Ilmu Komputer", harga: 220000, stok: 3 }
];

function byCategory(category: string): Book[] {
    return books.filter((book: Book) => book.kategori === category);
}
console.log("=== Daftar Buku Kategori Web ===");
console.log(byCategory("Web"));

interface BookValue {
    judul: string;
    total: number;
}

function totalNilaiGudang(): BookValue[] {
    return books.map((book: Book) => ({
        judul: book.judul,
        total: book.stok * book.harga
    }));
}
console.log("=== Total Nilai Gudang ===");
console.log(totalNilaiGudang());


function tambahStokTerbesar(): Book {
    const maxBook: Book = books.reduce((prev, curr) =>
        curr.stok > prev.stok ? curr : prev
    );
    maxBook.stok += 10;
    return maxBook;
}
console.log("=== Buku dengan stok terbesar setelah ditambah 10 ===");
console.log(tambahStokTerbesar());


function formatRingkas(): string[] {
    return books.map((book: Book) => `${book.judul} — Rp${book.harga} (Stok: ${book.stok})`);
}
console.log("=== Format Ringkas ===");
console.log(formatRingkas());


console.log("=== Semua Judul Buku ===");
books.forEach((book: Book) => console.log(book.judul));
