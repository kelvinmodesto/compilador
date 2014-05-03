#!/bin/bash

clear

echo "Removenod as pastas antigas"
rm -r src/portugol/analysis/
rm -r src/portugol/lexer/
rm -r src/portugol/node/
rm -r src/portugol/parser/

echo "Criando os novos arquivos da linguagem portugol.sable"
sablecc src/portugol.sable