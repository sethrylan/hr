package hr

import (
	"bufio"
	"fmt"
	"strings"
)

// RunArrayRotation ...
func RunArrayRotation() {
	//Enter your code here. Read input from STDIN. Print output to STDOUT
	ints, _ := ReadInts(bufio.ScanWords)
	result := rotate(ints[2:], ints[1])
	fmt.Println(strings.Trim(fmt.Sprint(result), "[]"))
}

func rotate(xs []int, k int) []int {
	if k == 0 {
		return xs
	}
	return rotate(append(xs[1:], xs[0]), k-1)
}
