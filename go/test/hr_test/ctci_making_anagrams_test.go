package hr_test

import (
	"hr"
	"io/ioutil"
	"log"
	"testing"
)

var simTests = []struct {
	a        string
	b        string
	expected int
}{
	{"abc", "cde", 4},
	{"fsqoiaidfaukvngpsugszsnseskicpejjvytviya", "ksmfgsxamduovigbasjchnoskolfwjhgetnmnkmcphqmpwnrrwtymjtwxget", 42},
}

func TestAnagram(t *testing.T) {
	log.SetOutput(ioutil.Discard)
	for _, tt := range simTests {
		x := hr.Anagram(tt.a, tt.b)

		if x != tt.expected {
			t.Errorf("Expected %d, got %d", tt.expected, x)
		}
	}
}
