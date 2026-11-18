class Badge {
    public String print(Integer id, String name, String department) {
        // 1. On gère la partie ID
        String idPart = "";
        if (id != null) {
            idPart = "[" + id + "] - ";
        }
        
        // 2. On gère la partie Département (ou OWNER si c'est null)
        String deptPart = "";
        if (department != null) {
            deptPart = department.toUpperCase();
        } else {
            deptPart = "OWNER";
        }
        
        // 3. On assemble le tout
        return idPart + name + " - " + deptPart;
    }
}