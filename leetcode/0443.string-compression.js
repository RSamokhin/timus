/**
 * @param {character[]} chars
 * @return {number}
 */
var compress = function(chars) {
    let i = 0;
    let length = -1;
    let prevChar;
    let charCount = 0;

    while (i <= chars.length) {
        if (chars[i] !== prevChar) {
            if (charCount > 1) {
                let textCharCount = charCount.toString().split('');
                textCharCount.forEach(t => {
                    length ++;
                    chars[length] = t;
                });
            }

            //start new char
            prevChar = chars[i];
            length++;
            chars[length] = chars[i];
            prevChar = chars[i];
            charCount = 1;
        } else {
            charCount ++;
        }
        i++;
    }
    return length;
};