import java.util.*;

/**
 * @author YoungCR
 * @date 2025/2/5 9:47
 * @descritpion Main
 */
public class Main {

    public List<Integer> findSubstring(String s, String[] words) {
        int k = words.length, w = words[0].length();
        List<Integer> ans = new ArrayList<>();

        Map<String, Integer> wMap = new HashMap<>(k);
        for (String word : words) {
            wMap.merge(word, 1, Integer::sum);
        }
        int sLen = s.length();

        // w 是单词的长度，外层循环的目的是从字符串的不同偏移量（i）开始，逐步处理字符串。
        // 这样可以确保所有可能的子串都被检查到。
        for (int i = 0; i < w; i++) {
            Map<String, Integer> sMap = new HashMap<>(k);
            // j 是当前窗口的起始位置，每次移动一个单词的长度 w。
            // j + w <= sLen 确保不会越界。
            for (int j = i; j + w <= sLen; j += w) {
                String sub = s.substring(j, j + w);
                // 提取从 j 开始长度为 w 的子串 sub，并将其加入滑动窗口的哈希表 sMap
                sMap.put(sub, sMap.getOrDefault(sub, 0) + 1);
                // 如果窗口大小超过了 k * w（即所有单词的总长度），需要移除窗口最左侧的单词。
                // 通过计算 idx 找到需要移除的单词，并更新 sMap。
                if (j >= i + (k * w)) {
                    int idx = j - (k * w);
                    String prev = s.substring(idx, idx + w);
                    if (sMap.get(prev) == 1) {
                        sMap.remove(prev);
                    } else {
                        sMap.put(prev, sMap.get(prev) - 1);
                    }
                    // 检查当前窗口中单词的频率是否与目标单词频率表 wMap 匹配。
                    // 如果不匹配，直接跳过当前窗口。
                    if (!sMap.getOrDefault(prev, 0).equals(wMap.getOrDefault(prev, 0))) {
                        continue;
                    }
                }
                // 检查当前窗口中单词的频率是否与目标单词频率表 wMap 匹配。
                // 如果不匹配，直接跳过当前窗口。
                if (!sMap.getOrDefault(sub, 0).equals(wMap.getOrDefault(sub, 0))) {
                    continue;
                }
                // 如果当前窗口的频率表 sMap 与目标频率表 wMap 完全相同，说明找到了一个符合条件的子串。
                if (sMap.equals(wMap)) {
                    ans.add(j - (k - 1) * w);
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(new Main().findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", new String[]{"fooo", "barr", "wing", "ding", "wing"}));
    }

}
