package hr

import (
	"bufio"
	"fmt"
	"math"
	"strings"
)

// MainAnagram ...
func MainAnagram() {
	//Enter your code here. Read input from STDIN. Print output to STDOUT
	words, _ := Read(bufio.ScanWords)
	// a, b := strings.Split(words[0], ""), strings.Split(words[1], "")
	fmt.Println(Anagram(words[0], words[1]))
}

// Anagram ...
//http://en.wikipedia.org/wiki/Longest_common_subsequence_problem
func Anagram(a string, b string) int {
	var letterDiff = make(map[string]int)
	for _, elem := range strings.Split(a, "") {
		letterDiff[elem]++
	}
	for _, elem := range strings.Split(b, "") {
		letterDiff[elem]--
	}
	var result int
	for _, i := range letterDiff {
		result += int(math.Abs(float64(i)))
	}
	return result
}
