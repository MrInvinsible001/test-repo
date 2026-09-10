const crypto = require("crypto");

const hash = crypto.createHash("md5");
const keyPair = crypto.generateKeyPairSync("rsa", {
    modulusLength: 2048
});

console.log(hash);
console.log(keyPair);
