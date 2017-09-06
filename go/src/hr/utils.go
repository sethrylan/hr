package hr

import (
	"bufio"
	"os"
	"strconv"
)

// Read ...
func Read(scanBy func(data []byte, atEOF bool) (advance int, token []byte, err error)) ([]int, error) {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Split(scanBy)
	var result []int
	for scanner.Scan() {
		x, err := strconv.Atoi(scanner.Text())
		if err != nil {
			return result, err
		}
		result = append(result, x)
	}
	return result, scanner.Err()
}
