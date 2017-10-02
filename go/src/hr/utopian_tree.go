package hr

import (
	"bufio"
	"fmt"
)

func mainUtopianTree() {
	//Enter your code here. Read input from STDIN. Print output to STDOUT
	ints, _ := ReadInts(bufio.ScanWords)
	for _, n := range ints[1:] {
		fmt.Println(eutopianGrowth(n))
	}
}

func eutopianGrowth(n int) int {
	switch {
	case n == 0:
		return 1
	case n%2 == 0:
		return eutopianGrowth(n-1) + 1
	default:
		return eutopianGrowth(n-1) * 2
	}
}
