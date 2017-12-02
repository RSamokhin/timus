/**
 * @param {string} s
 * @return {boolean}
 */
var isNumber = function(s) {
    s = s.trim();
    s = s.split('');
    let result = s.length > 0;
    let allowedDigits = ['0','1','2','3','4','5','6','7','8','9','0'];
    let allowedSymbols = ['e','.','-','+'];
    if (!s.some(d => ~allowedDigits.indexOf(d))) { return false; console.log('trigger no digits');}
    for (let i = 0; i < s.length; i ++) {
        let f = s[i];
        if (!(~allowedDigits.indexOf(f) || ~allowedSymbols.indexOf(f))) { result = false; console.log('trigger other symbol');}
        if (f === '+' && (
                i === s.length - 1 ||
                !(
                    i === 0 ||
                    (i !== 0 && s[i - 1] === 'e')
                )
            )
        ) { result = false; console.log('trigger +');}
        if (f === '-' && (
                i === s.length - 1 ||
                !(
                    i === 0 ||
                    (i !== 0 && s[i - 1] === 'e')
                )
            )
        ) { result = false; console.log('trigger -');}
        if (f === 'e' && (
            i !== s.indexOf('e') ||
            i === 0 ||
            i === s.length - 1 ||
            i < s.lastIndexOf('.') ||
            !s.slice(0, i).some(d => ~allowedDigits.indexOf(d))
        )) { result = false; console.log('trigger e');}
        if (f === '.' && (
            i !== s.indexOf('.')
        )) { result = false; console.log('trigger .');}

        if (!result) break;
    };
    return result;
};