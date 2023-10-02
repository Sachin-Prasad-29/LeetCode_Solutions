class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        n = len(s)
        sHashMap,tHashMap = {},{}
        for i in range(n):
            sHashMap[s[i]] = 1 + sHashMap.get(s[i],0)
            tHashMap[t[i]] = 1 + tHashMap.get(t[i],0)
        
        for key in sHashMap:
            if sHashMap[key] != tHashMap.get(key,0):
                return False
        return True
        