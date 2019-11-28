const biscuits = [ 'oreo','goodday','hide&seek','50-50','sunfeast'];
console.log(typeof biscuits)
console.log('==========================================================')

biscuits.forEach(function(value,index){
    console.log('using forEach method = ',value)
});
console.log('==========================================================')

console.log(`isArrayornot = `,Array.isArray(biscuits));
console.log('==========================================================')

console.log(`has50-50 = `,biscuits.includes('50-50',8))
console.log('==========================================================')

biscuits.push('dark fantasy',`parle-g`)
console.log(`after push() = `,biscuits);
console.log('==========================================================')

biscuits.pop()
console.log(`after pop() = `,biscuits)
console.log('==========================================================')

biscuits.unshift('krackjack')
console.log(`after unshift() = `,biscuits)
console.log('==========================================================')

biscuits.shift()
console.log(`after shift() = `,biscuits)
console.log('==========================================================')

biscuits.splice(1,2,'moms magic')
console.log(`after splice() = `,biscuits)
console.log('==========================================================')

const b1 = biscuits.slice(1,3)
console.log(`after slice() = `,b1)
console.log('==========================================================')

const index = biscuits.indexOf('dark fantasy')
console.log( `index of dark fantasy =`,index)
console.log('==========================================================')

const b2 = biscuits.join('-')
console.log(`after joining = `,b2)
console.log('==========================================================')

const arr = [10,20,30,40,50];
const map1 = arr.map(value => value + 50);
console.log(`after map fat arrow =`,map1)
console.log('==========================================================')

const filter1 = arr.filter(value => value >= 30);
console.log(`after filter fat arrow =`,filter1)
console.log('********************************************************************************************')
console.log('********************************************************************************************')


const chocolates = [ 'eclairs','gonemad','dairymilk','temptation','milkybar','kitkat'];
console.log(typeof chocolates)
console.log('==========================================================')

chocolates.forEach(function(value,index){
    console.log('using forEach method = ',value)
});
console.log('==========================================================')

console.log(`isArrayornot = `,Array.isArray(chocolates));
console.log('==========================================================')

console.log(`hasdairymilk = `,chocolates.includes('dairymilk',1))
console.log('==========================================================')

chocolates.push('melody',`munch`)
console.log(`after push() = `,chocolates);
console.log('==========================================================')

chocolates.pop()
console.log(`after pop() = `,chocolates)
console.log('==========================================================')

chocolates.unshift('mangobite')
console.log(`after unshift() = `,chocolates)
console.log('==========================================================')

chocolates.shift()
console.log(`after shift() = `,chocolates)
console.log('==========================================================')

chocolates.splice(1,2,'perk')
console.log(`after splice() = `,chocolates)
console.log('==========================================================')

const c1 = chocolates.slice(1,3)
console.log(`after slice() = `,c1)
console.log('==========================================================')

const index1= chocolates.indexOf('temptation')
console.log( `index of temptation =`,index1)
console.log('==========================================================')

const c2 = chocolates.join('*')
console.log(`after joining = `,c2)
console.log('==========================================================')

const arr1 = [100,110,120,130,140,150];
const map2 = arr1.map(value => value + 150);
console.log(`after map fat arrow =`,map2)
console.log('==========================================================')

const filter2= arr1.filter(value => value >= 120);
console.log(`after filter fat arrow =`,filter2)
console.log('********************************************************************************************')
console.log('********************************************************************************************')

const dryfruits = [ 'almond','cashew','dates','walnut'];
console.log(typeof dryfruits)
console.log('==========================================================')

dryfruits.forEach(function(value,index){
    console.log('using forEach method = ',value)
});
console.log('==========================================================')

console.log(`isArrayornot = `,Array.isArray(dryfruits));
console.log('==========================================================')

console.log(`haswalnut = `,dryfruits.includes('walnut',2))
console.log('==========================================================')

dryfruits.push('rasins',`peanuts`)
console.log(`after push() = `,dryfruits);
console.log('==========================================================')

dryfruits.pop()
console.log(`after pop() = `,dryfruits)
console.log('==========================================================')

dryfruits.unshift('pista')
console.log(`after unshift() = `,dryfruits)
console.log('==========================================================')

dryfruits.shift()
console.log(`after shift() = `,dryfruits)
console.log('==========================================================')

dryfruits.splice(2,4,'black walnuts')
console.log(`after splice() = `,dryfruits)
console.log('==========================================================')

const d1 = dryfruits.slice(1,3)
console.log(`after slice() = `,d1)
console.log('==========================================================')

const index2 = dryfruits.indexOf('almond')
console.log( `index of almonds =`,index2)
console.log('==========================================================')

const d2 = dryfruits.join('#')
console.log(`after joining = `,d2)
console.log('==========================================================')

const arr2 = [656,767,878,989,212,535];
const map3 = arr2.map(value => value - 50);
console.log(`after map fat arrow =`,map3)
console.log('==========================================================')

const filter3= arr2.filter(value => value <= 730);
console.log(`after filter fat arrow =`,filter3)
console.log('********************************************************************************************')
console.log('********************************************************************************************')

const Gods = [ 'Ishwar','Allah','Jesus','Buddha','Krishna'];
console.log(typeof Gods)
console.log('==========================================================')

Gods.forEach(function(value,index){
    console.log('using forEach method = ',value)
});
console.log('==========================================================')

console.log(`isArrayornot = `,Array.isArray(Gods));
console.log('==========================================================')

console.log(`hasganesha = `,Gods.includes('Ganesha'))
console.log('==========================================================')

Gods.push('Venkateshwara',`Rama`)
console.log(`after push() = `,Gods);
console.log('==========================================================')

Gods.pop()
console.log(`after pop() = `,Gods)
console.log('==========================================================')

Gods.unshift('Brahma')
console.log(`after unshift() = `,Gods)
console.log('==========================================================')

Gods.shift()
console.log(`after shift() = `,Gods)
console.log('==========================================================')

Gods.splice(3,0,'Vishnu')
console.log(`after splice() = `,Gods)
console.log('==========================================================')

const g1 = Gods.slice(0,3)
console.log(`after slice() = `,g1)
console.log('==========================================================')

const index3 = Gods.indexOf('Allah')
console.log( `index of Allah =`,index3)
console.log('==========================================================')

const g2 = Gods.join('^')
console.log(`after joining = `,g2)
console.log('==========================================================')

const arr3 = [2,3,4,5,6,7,8];
const map4 = arr3.map(value => value * 50);
console.log(`after map fat arrow =`,map4)
console.log('==========================================================')

const filter4= arr3.filter(value => value <= 5);
console.log(`after filter fat arrow =`,filter4)
console.log('*******************************************************************************************')
console.log('*******************************************************************************************')

const Godess = [ 'Yellamma','Laxmi','Parvathi','Chamundi','Saraswathi'];
console.log(typeof Godess)
console.log('==========================================================')

Godess.forEach(function(value,index){
    console.log('using forEach method = ',value)
});
console.log('==========================================================')

console.log(`isArrayornot = `,Array.isArray(Godess));
console.log('==========================================================')

console.log(`haschamundi = `,Godess.includes('Chamundi'))
console.log('==========================================================')

Godess.push('Durga',`Seetha`)
console.log(`after push() = `,Godess);
console.log('==========================================================')

Godess.pop()
console.log(`after pop() = `,Godess)
console.log('==========================================================')

Godess.unshift('Kaalikamba')
console.log(`after unshift() = `,Godess)
console.log('==========================================================')

Godess.shift()
console.log(`after shift() = `,Godess)
console.log('==========================================================')

Godess.splice(3,1,'Tulsi')
console.log(`after splice() = `,Godess)
console.log('==========================================================')

const gs1 = Godess.slice(2,4)
console.log(`after slice() = `,gs1)
console.log('==========================================================')

const index5 = Godess.indexOf('Tulsi')
console.log( `index of Tulsi =`,index5)
console.log('==========================================================')

const gs2 = Godess.join('^')
console.log(`after joining = `,gs2)
console.log('==========================================================')

const arr5 = [200,300,400,500,600,700,800];
const map5 = arr5.map(value => value / 50);
console.log(`after map fat arrow =`,map5)
console.log('==========================================================')

const filter5 = arr5.filter(value => value === 800);
console.log(`after filter fat arrow =`,filter5)

console.log('********************************************************************************************')
console.log('********************************************************************************************')

const ff = [ 'Bhagat Singh','Mahatma Gandhiji','Jawaharlal Nehru','Subhash Chandra Bose'];
console.log(typeof ff)
console.log('==========================================================')

ff.forEach(function(value,index){
    console.log('using forEach method = ',value)
});
console.log('==========================================================')

console.log(`isArrayornot = `,Array.isArray(ff));
console.log('==========================================================')

console.log(`hasGanesh = `,ff.includes('Ganesh'))
console.log('==========================================================')

ff.push('Mangal Pandey','Shivram Rajguru')
console.log(`after push() = `,ff);
console.log('==========================================================')

ff.pop()
console.log(`after pop() = `,ff)
console.log('==========================================================')

ff.unshift('Rajendra Prasad')
console.log(`after unshift() = `,ff)
console.log('==========================================================')

ff.shift()
console.log(`after shift() = `,ff)
console.log('==========================================================')

ff.splice(0,0,'Jhansi Rani Laxmi Bai')
console.log(`after splice() = `,ff)
console.log('==========================================================')

const f1 = ff.slice(1,3)
console.log(`after slice() = `,f1)
console.log('==========================================================')

const index6 = ff.indexOf('Rajendra Prasada')
console.log( `index of Rajendra Prasad =`,index6)
console.log('==========================================================')

const f2 = ff.join('==')
console.log(`after joining = `,f2)
console.log('==========================================================')

const arr6 = [200,300,400,500,600,700,800];
const map6 = arr6.map(value => value % 50);
console.log(`after map fat arrow =`,map6)
console.log('==========================================================')

const filter6 = arr6.filter(value => value !== 800);
console.log(`after filter fat arrow =`,filter6)

console.log('********************************************************************************************')
console.log('********************************************************************************************')

const utensils = [ 'Bowl','Spoon','Glass','Plate'];
console.log(typeof utensils)
console.log('==========================================================')

utensils.forEach(function(value,index){
    console.log('using forEach method = ',value)
});
console.log('==========================================================')

console.log(`isArrayornot = `,Array.isArray(utensils));
console.log('==========================================================')

console.log(`hasGanesh = `,utensils.includes('Plate'))
console.log('==========================================================')

utensils.push('Porks','Knife')
console.log(`after push() = `,utensils);
console.log('==========================================================')

utensils.pop()
console.log(`after pop() = `,utensils)
console.log('==========================================================')

utensils.unshift('Grinder')
console.log(`after unshift() = `,utensils)
console.log('==========================================================')

utensils.shift()
console.log(`after shift() = `,utensils)
console.log('==========================================================')

utensils.splice(4,1,' Mixer')
console.log(`after splice() = `,utensils)
console.log('==========================================================')

const f3 = utensils.slice(1,5)
console.log(`after slice() = `,f3)
console.log('==========================================================')

const index7 = utensils.indexOf('Spoon')
console.log( `index of Spoon =`,index7)
console.log('==========================================================')

const f4 = utensils.join('@@')
console.log(`after joining = `,f4)
console.log('==========================================================')

const arr7 = [88,44,66,22,55];
const map7 = arr7.map(value => value % 20);
console.log(`after map fat arrow =`,map7)
console.log('==========================================================')

const filter7 = arr7.filter(value => value !== 55);
console.log(`after filter fat arrow =`,filter7)
console.log('********************************************************************************************')
console.log('********************************************************************************************')

const family = [ ' Grandfather',' Grandmother',' Father','  Mother'];
console.log(typeof family)
console.log('==========================================================')

family.forEach(function(value,index){
    console.log('using forEach method = ',value)
});
console.log('==========================================================')

console.log(`isArrayornot = `,Array.isArray(family));
console.log('==========================================================')

console.log(`hasfather = `,family.includes('Father'))
console.log('==========================================================')

family.push('Uncle ',' Aunt')
console.log(`after push() = `,family);
console.log('==========================================================')

family.pop()
console.log(`after pop() = `,family)
console.log('==========================================================')

family.unshift(' Brother')
console.log(`after unshift() = `,family)
console.log('==========================================================')

family.shift()
console.log(`after shift() = `,family)
console.log('==========================================================')

family.splice(3,0,'Sister')
console.log(`after splice() = `,family)
console.log('==========================================================')

const f5 = family.slice(2,5)
console.log(`after slice() = `,f5)
console.log('==========================================================')

const index8 = family.indexOf('Grandmother')
console.log( `index of Grandmother =`,index8)
console.log('==========================================================')

const f6 = family.join('//')
console.log(`after joining = `,f6)
console.log('==========================================================')

const arr8 = [200,300,400,500,600,700,800];
const map8 = arr8.map(value => value !== 500);
console.log(`after map fat arrow =`,map8)
console.log('==========================================================')

const filter8 = arr8.filter(value => value % 200);
console.log(`after filter fat arrow =`,filter8)

console.log('********************************************************************************************')
console.log('********************************************************************************************')


const div5 = [5,10,15,20,35,30];
console.log(typeof div5)
console.log('==========================================================')

div5.forEach(function(value,index){
    console.log('using forEach method = ',value)
});
console.log('==========================================================')

console.log(`isArrayornot = `,Array.isArray(div5));
console.log('==========================================================')

console.log(`has10 = `,div5.includes(10))
console.log('==========================================================')

div5.push( 40,50)
console.log(`after push() = `,div5);
console.log('==========================================================')

div5.pop()
console.log(`after pop() = `,div5)
console.log('==========================================================')

div5.unshift(100,200)
console.log(`after unshift() = `,div5)
console.log('==========================================================')

div5.shift()
console.log(`after shift() = `,div5)
console.log('==========================================================')

div5.splice(3,0,90)
console.log(`after splice() = `,div5)
console.log('==========================================================')

const div = div5.slice(1,3)
console.log(`after slice() = `,div)
console.log('==========================================================')

const index9= div5.indexOf(35)
console.log( `index of 35 =`,index9)
console.log('==========================================================')

const f7 = div5.join('//')
console.log(`after joining = `,f7)
console.log('==========================================================')

const arr9 = [200,300,400,500,600,700,800];
const map9 = arr9.map(value => value === 500);
console.log(`after map fat arrow =`,map9)
console.log('==========================================================')

const filter9 = arr9.filter(value => value  < 100);
console.log(`after filter fat arrow =`,filter9)
console.log('********************************************************************************************')
console.log('********************************************************************************************')


const games = [ ' cricket',' badminton',' khokho','  tennis','hockey'];
console.log(typeof games)
console.log('==========================================================')

games.forEach(function(value,index){
    console.log('using forEach method = ',value)
});
console.log('==========================================================')

console.log(`isArrayornot = `,Array.isArray(games));
console.log('==========================================================')

console.log(`hasfather = `,games.includes('khokho'))
console.log('==========================================================')

games.push('throwball ',' volleyball')
console.log(`after push() = `,games);
console.log('==========================================================')

games.pop()
console.log(`after pop() = `,games)
console.log('==========================================================')

games.unshift(' shotput')
console.log(`after unshift() = `,games)
console.log('==========================================================')

games.shift()
console.log(`after shift() = `,games)
console.log('==========================================================')

games.splice(3,0,'longjump')
console.log(`after splice() = `,games)
console.log('==========================================================')

const f8 = games.slice(2,4)
console.log(`after slice() = `,f8)
console.log('==========================================================')

const index10= games.indexOf('hockey')
console.log( `index of hockey =`,index10)
console.log('==========================================================')

const f9 = games.join('//')
console.log(`after joining = `,f9)
console.log('==========================================================')

const arr10 = [20,60,70,80];
const map10 = arr10.map(value => value += 500);
console.log(`after map fat arrow =`,map10)
console.log('==========================================================')

const filter10 = arr10.filter(value => value > 10);
console.log(`after filter fat arrow =`,filter10)

console.log('********************************************************************************************')
console.log('********************************************************************************************')








