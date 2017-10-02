package hr

import (
	"bufio"
	"os"
	"strconv"
)

// ReadInts ...
func ReadInts(scanBy func(data []byte, atEOF bool) (advance int, token []byte, err error)) ([]int, error) {
	words, scanerr := Read(bufio.ScanWords)
	var result []int
	for _, word := range words {
		x, err := strconv.Atoi(word)
		if err != nil {
			return result, err
		}
		result = append(result, x)
	}
	return result, scanerr
}

// Read ...
func Read(scanBy func(data []byte, atEOF bool) (advance int, token []byte, err error)) ([]string, error) {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Split(scanBy)
	var result []string
	for scanner.Scan() {
		x := scanner.Text()
		result = append(result, x)
	}
	return result, scanner.Err()
}
