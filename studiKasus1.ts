interface Order {
  id: number;
  customer: string;
  menu: string;
  qty: number;
  price: number;
}

const orders: Order[] = [
  { id: 1, customer: "Andi", menu: "Nasi Goreng", qty: 2, price: 20000 },
  { id: 2, customer: "Budi", menu: "Mie Ayam", qty: 1, price: 15000 },
  { id: 3, customer: "Citra", menu: "Es Teh", qty: 3, price: 5000 },
  { id: 4, customer: "Andi", menu: "Es Jeruk", qty: 1, price: 8000 },
];

const customerTotals = orders.map(order => {
  const totalHarga = order.qty * order.price;
  console.log(`- Pesanan dari ${order.customer} (ID: ${order.id}): Rp. ${totalHarga}`);
  return {
    pelanggan: order.customer,
    totalHargaPesanan: totalHarga,
  };
});

console.log(customerTotals);

const pesananQtyLebihDariSatu = orders.filter(order => order.qty > 1);

console.log(pesananQtyLebihDariSatu);

