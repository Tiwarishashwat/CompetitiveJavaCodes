int swapAdjacentBits(int n) {
  return (((n & 0xAAAAAAAA)>>1)|((n & 0X55555555)<<1));
}
