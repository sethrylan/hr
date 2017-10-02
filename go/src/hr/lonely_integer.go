package hr

import (
	"bufio"
	"fmt"
)

// MainLonelyInteger ...
func MainLonelyInteger() {
	//Enter your code here. Read input from STDIN. Print output to STDOUT
	ints, _ := ReadInts(bufio.ScanWords)
	// a, b := strings.Split(words[0], ""), strings.Split(words[1], "")
	fmt.Println(lonely(ints))
}

// Anagram ...
//http://en.wikipedia.org/wiki/Longest_common_subsequence_problem
func lonely(a []int) int {
	xor := a[0]
	for _, elem := range a {
		xor ^= elem
	}
	return xor
}
