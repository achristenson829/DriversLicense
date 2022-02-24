public class WisconsinFormatter implements DriversLicenseFormatter{
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {

            String SSSS = driversLicense.getSoundexCode();
            String FFF = String.valueOf(driversLicense.getFirstNameMiddleInitial());
            String YY = String.valueOf(driversLicense.getBirthYear());
            String DDD = String.valueOf(driversLicense.getBirthMonthDayGender());
            String N = String.valueOf(driversLicense.getOverflow());

            return String.format("Wisconsin: %s-%s-%s-%s%s", SSSS, FFF + YY.charAt(2), YY.charAt(3)+DDD, N, N);
    }
}
